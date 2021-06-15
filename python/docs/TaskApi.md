# swagger_client.TaskApi

All URIs are relative to *https://kinocontent.club/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_task**](TaskApi.md#add_task) | **POST** /task | Добавление задания
[**delete_task**](TaskApi.md#delete_task) | **DELETE** /task | Удаление задания
[**edit_task**](TaskApi.md#edit_task) | **PUT** /task | Редактирование задания
[**get_task**](TaskApi.md#get_task) | **GET** /task | Получение информации о задании
[**get_tasks**](TaskApi.md#get_tasks) | **GET** /tasks | Получение списка заданий

# **add_task**
> object add_task(kinopoisk_id=kinopoisk_id)

Добавление задания

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
kinopoisk_id = 56 # int | ID фильма или сериала с Кинопоиска (optional)

try:
    # Добавление задания
    api_response = api_instance.add_task(kinopoisk_id=kinopoisk_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->add_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kinopoisk_id** | **int**| ID фильма или сериала с Кинопоиска | [optional] 

### Return type

**object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_task**
> bool delete_task(id)

Удаление задания

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID задания

try:
    # Удаление задания
    api_response = api_instance.delete_task(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->delete_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID задания | 

### Return type

**bool**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit_task**
> object edit_task(id, symbols_from=symbols_from, symbols_to=symbols_to, comment=comment, private_comment=private_comment, confirmed=confirmed, express=express, archived=archived, rework=rework, rework_comment=rework_comment)

Редактирование задания

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID задания
symbols_from = 56 # int | Символов От (optional)
symbols_to = 56 # int | Символов До (optional)
comment = 'comment_example' # str | Комментарий к заданию (optional)
private_comment = 'private_comment_example' # str | Приватный комментарий (видит только сам пользователь) (optional)
confirmed = true # bool | Подтвержденное задание (отправлено на выполнение) (optional)
express = true # bool | Экспресс задание (optional)
archived = true # bool | Задание в архиве (optional)
rework = true # bool | Задание на доработке (optional)
rework_comment = 'rework_comment_example' # str | Комментарий доработки (optional)

try:
    # Редактирование задания
    api_response = api_instance.edit_task(id, symbols_from=symbols_from, symbols_to=symbols_to, comment=comment, private_comment=private_comment, confirmed=confirmed, express=express, archived=archived, rework=rework, rework_comment=rework_comment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->edit_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID задания | 
 **symbols_from** | **int**| Символов От | [optional] 
 **symbols_to** | **int**| Символов До | [optional] 
 **comment** | **str**| Комментарий к заданию | [optional] 
 **private_comment** | **str**| Приватный комментарий (видит только сам пользователь) | [optional] 
 **confirmed** | **bool**| Подтвержденное задание (отправлено на выполнение) | [optional] 
 **express** | **bool**| Экспресс задание | [optional] 
 **archived** | **bool**| Задание в архиве | [optional] 
 **rework** | **bool**| Задание на доработке | [optional] 
 **rework_comment** | **str**| Комментарий доработки | [optional] 

### Return type

**object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_task**
> InlineResponse200 get_task(id)

Получение информации о задании

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID задания

try:
    # Получение информации о задании
    api_response = api_instance.get_task(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->get_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID задания | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tasks**
> object get_tasks(include_data=include_data, done=done, confirmed=confirmed, archived=archived, limit=limit, page=page)

Получение списка заданий

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
include_data = true # bool | С расширенными данными (по умолчанию) / Только ID (optional)
done = true # bool | Выполненные / не выполненные (optional)
confirmed = true # bool | Отправленные в работу / не отправленные (optional)
archived = true # bool | В архиве / не в архиве (optional)
limit = 56 # int | Лимит (от 1 до 100 элементов) (optional)
page = 56 # int | Номер страницы (optional)

try:
    # Получение списка заданий
    api_response = api_instance.get_tasks(include_data=include_data, done=done, confirmed=confirmed, archived=archived, limit=limit, page=page)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->get_tasks: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_data** | **bool**| С расширенными данными (по умолчанию) / Только ID | [optional] 
 **done** | **bool**| Выполненные / не выполненные | [optional] 
 **confirmed** | **bool**| Отправленные в работу / не отправленные | [optional] 
 **archived** | **bool**| В архиве / не в архиве | [optional] 
 **limit** | **int**| Лимит (от 1 до 100 элементов) | [optional] 
 **page** | **int**| Номер страницы | [optional] 

### Return type

**object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

