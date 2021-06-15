# swagger_client.UserApi

All URIs are relative to *https://kinocontent.club/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**edit_user**](UserApi.md#edit_user) | **PUT** /user | Редактирование пользователя
[**get_user**](UserApi.md#get_user) | **GET** /user | Получение информации о пользователе

# **edit_user**
> object edit_user(symbols_from=symbols_from, symbols_to=symbols_to, comment=comment, private_comment=private_comment, express=express)

Редактирование пользователя

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
symbols_from = 56 # int | Символов от (optional)
symbols_to = 56 # int | Символов до (optional)
comment = 'comment_example' # str | Комментарий по умолчанию (optional)
private_comment = 'private_comment_example' # str | Комментарий для себя по умолчанию (optional)
express = true # bool | Экспресс задания по умолчанию (optional)

try:
    # Редактирование пользователя
    api_response = api_instance.edit_user(symbols_from=symbols_from, symbols_to=symbols_to, comment=comment, private_comment=private_comment, express=express)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->edit_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbols_from** | **int**| Символов от | [optional] 
 **symbols_to** | **int**| Символов до | [optional] 
 **comment** | **str**| Комментарий по умолчанию | [optional] 
 **private_comment** | **str**| Комментарий для себя по умолчанию | [optional] 
 **express** | **bool**| Экспресс задания по умолчанию | [optional] 

### Return type

**object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user**
> InlineResponse2001 get_user()

Получение информации о пользователе

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))

try:
    # Получение информации о пользователе
    api_response = api_instance.get_user()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->get_user: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

