package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse2001;

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
public interface UserApi  {

    /**
     * Получение информации о пользователе
     *
     */
    @GET
    @Path("/user")
    @Produces({ "application/json" })
    @Operation(summary = "Получение информации о пользователе", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Информация о пользователе", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))),
        @ApiResponse(responseCode = "400", description = "Ошибка", content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "401", description = "Ошибка авторизации", content = @Content(schema = @Schema(implementation = Error.class))) })
    public InlineResponse2001 userGet();

    /**
     * Редактирование пользователя
     *
     */
    @PUT
    @Path("/user")
    @Produces({ "application/json" })
    @Operation(summary = "Редактирование пользователя", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Информация о пользователе после редактирования", content = @Content(schema = @Schema(implementation = Object.class))),
        @ApiResponse(responseCode = "400", description = "Ошибка", content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "401", description = "Ошибка авторизации", content = @Content(schema = @Schema(implementation = Error.class))) })
    public Object userPut(@QueryParam("symbols_from")Integer symbolsFrom, @QueryParam("symbols_to")Integer symbolsTo, @QueryParam("comment")String comment, @QueryParam("private_comment")String privateComment, @QueryParam("express")Boolean express);
}
