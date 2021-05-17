# swagger_client.TaskApi

All URIs are relative to *https://kinocontent.club/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**task_delete**](TaskApi.md#task_delete) | **DELETE** /task | Удаление задания
[**task_get**](TaskApi.md#task_get) | **GET** /task | Получение информации о задании
[**task_post**](TaskApi.md#task_post) | **POST** /task | Добавление задания
[**task_put**](TaskApi.md#task_put) | **PUT** /task | Редактирование задания
[**tasks_get**](TaskApi.md#tasks_get) | **GET** /tasks | Получение списка заданий

# **task_delete**
> bool task_delete(id)

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
    api_response = api_instance.task_delete(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->task_delete: %s\n" % e)
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

# **task_get**
> InlineResponse200 task_get(id)

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
    api_response = api_instance.task_get(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->task_get: %s\n" % e)
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

# **task_post**
> object task_post(kinopoisk_id=kinopoisk_id)

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
    api_response = api_instance.task_post(kinopoisk_id=kinopoisk_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->task_post: %s\n" % e)
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

# **task_put**
> object task_put(id, symbols_from=symbols_from, symbols_to=symbols_to, comment=comment, private_comment=private_comment, confirmed=confirmed, express=express, archived=archived, rework=rework, rework_comment=rework_comment)

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
    api_response = api_instance.task_put(id, symbols_from=symbols_from, symbols_to=symbols_to, comment=comment, private_comment=private_comment, confirmed=confirmed, express=express, archived=archived, rework=rework, rework_comment=rework_comment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->task_put: %s\n" % e)
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

# **tasks_get**
> object tasks_get(include_data=include_data, done=done, confirmed=confirmed, archived=archived, limit=limit, page=page)

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
    api_response = api_instance.tasks_get(include_data=include_data, done=done, confirmed=confirmed, archived=archived, limit=limit, page=page)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->tasks_get: %s\n" % e)
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

