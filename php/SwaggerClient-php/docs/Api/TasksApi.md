# Swagger\Client\TasksApi

All URIs are relative to *https://kinocontent.club/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taskGet**](TasksApi.md#taskget) | **GET** /task | Получение информации о задании
[**taskPost**](TasksApi.md#taskpost) | **POST** /task | Добавление задания
[**tasksGet**](TasksApi.md#tasksget) | **GET** /tasks | Получение списка заданий

# **taskGet**
> \Swagger\Client\Model\InlineResponse200 taskGet($id)

Получение информации о задании

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\TasksApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 56; // int | ID задания

try {
    $result = $apiInstance->taskGet($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TasksApi->taskGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID задания |

### Return type

[**\Swagger\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **taskPost**
> \Swagger\Client\Model\InlineResponse2001 taskPost($kinopoisk_id)

Добавление задания

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\TasksApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$kinopoisk_id = 56; // int | ID фильма или сериала с Кинопоиска

try {
    $result = $apiInstance->taskPost($kinopoisk_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TasksApi->taskPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kinopoisk_id** | **int**| ID фильма или сериала с Кинопоиска |

### Return type

[**\Swagger\Client\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tasksGet**
> object tasksGet($confirmed)

Получение списка заданий

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\TasksApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$confirmed = true; // bool | только отправленные на выполнение

try {
    $result = $apiInstance->tasksGet($confirmed);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TasksApi->tasksGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **confirmed** | **bool**| только отправленные на выполнение | [optional]

### Return type

**object**

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

