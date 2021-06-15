package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Киноконтент API
 *
 * <p>REST API биржи описаний к фильмам и сериалам https://kinocontent.club
 *
 */
@Path("/")
public interface TaskApi  {

    /**
     * Удаление задания
     *
     */
    @DELETE
    @Path("/task")
    @Produces({ "application/json" })
    @Operation(summary = "Удаление задания", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Удаление прошло успешно", content = @Content(schema = @Schema(implementation = Boolean.class))),
        @ApiResponse(responseCode = "400", description = "Ошибка", content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "401", description = "Ошибка авторизации", content = @Content(schema = @Schema(implementation = Error.class))) })
    public Boolean taskDelete(@QueryParam("id")Integer id);

    /**
     * Получение информации о задании
     *
     */
    @GET
    @Path("/task")
    @Produces({ "application/json" })
    @Operation(summary = "Получение информации о задании", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Информация о задании", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        @ApiResponse(responseCode = "400", description = "Ошибка", content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "401", description = "Ошибка авторизации", content = @Content(schema = @Schema(implementation = Error.class))) })
    public InlineResponse200 taskGet(@QueryParam("id")Integer id);

    /**
     * Добавление задания
     *
     */
    @POST
    @Path("/task")
    @Produces({ "application/json" })
    @Operation(summary = "Добавление задания", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Информация о созданном задании", content = @Content(schema = @Schema(implementation = Object.class))),
        @ApiResponse(responseCode = "400", description = "Ошибка", content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "401", description = "Ошибка авторизации", content = @Content(schema = @Schema(implementation = Error.class))) })
    public Object taskPost(@QueryParam("kinopoisk_id")Integer kinopoiskId);

    /**
     * Редактирование задания
     *
     */
    @PUT
    @Path("/task")
    @Produces({ "application/json" })
    @Operation(summary = "Редактирование задания", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Информация о задании после редактирования", content = @Content(schema = @Schema(implementation = Object.class))),
        @ApiResponse(responseCode = "400", description = "Ошибка", content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "401", description = "Ошибка авторизации", content = @Content(schema = @Schema(implementation = Error.class))) })
    public Object taskPut(@QueryParam("id")Integer id, @QueryParam("symbols_from")Integer symbolsFrom, @QueryParam("symbols_to")Integer symbolsTo, @QueryParam("comment")String comment, @QueryParam("private_comment")String privateComment, @QueryParam("confirmed")Boolean confirmed, @QueryParam("express")Boolean express, @QueryParam("archived")Boolean archived, @QueryParam("rework")Boolean rework, @QueryParam("rework_comment")String reworkComment);

    /**
     * Получение списка заданий
     *
     */
    @GET
    @Path("/tasks")
    @Produces({ "application/json" })
    @Operation(summary = "Получение списка заданий", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Список заданий", content = @Content(schema = @Schema(implementation = Object.class))),
        @ApiResponse(responseCode = "400", description = "Ошибка", content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "401", description = "Ошибка авторизации", content = @Content(schema = @Schema(implementation = Error.class))) })
    public Object tasksGet(@QueryParam("include_data")Boolean includeData, @QueryParam("done")Boolean done, @QueryParam("confirmed")Boolean confirmed, @QueryParam("archived")Boolean archived, @QueryParam("limit")Integer limit, @QueryParam("page")Integer page);
}
