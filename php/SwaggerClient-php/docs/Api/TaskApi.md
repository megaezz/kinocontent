# Swagger\Client\TaskApi

All URIs are relative to *https://kinocontent.club/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTask**](TaskApi.md#addtask) | **POST** /task | Добавление задания
[**deleteTask**](TaskApi.md#deletetask) | **DELETE** /task | Удаление задания
[**editTask**](TaskApi.md#edittask) | **PUT** /task | Редактирование задания
[**getTask**](TaskApi.md#gettask) | **GET** /task | Получение информации о задании
[**getTasks**](TaskApi.md#gettasks) | **GET** /tasks | Получение списка заданий

# **addTask**
> object addTask($kinopoisk_id)

Добавление задания

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\TaskApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$kinopoisk_id = 56; // int | ID фильма или сериала с Кинопоиска

try {
    $result = $apiInstance->addTask($kinopoisk_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaskApi->addTask: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kinopoisk_id** | **int**| ID фильма или сериала с Кинопоиска | [optional]

### Return type

**object**

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteTask**
> bool deleteTask($id)

Удаление задания

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\TaskApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 56; // int | ID задания

try {
    $result = $apiInstance->deleteTask($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaskApi->deleteTask: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID задания |

### Return type

**bool**

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **editTask**
> object editTask($id, $symbols_from, $symbols_to, $comment, $private_comment, $confirmed, $express, $archived, $rework, $rework_comment)

Редактирование задания

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\TaskApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 56; // int | ID задания
$symbols_from = 56; // int | Символов От
$symbols_to = 56; // int | Символов До
$comment = "comment_example"; // string | Комментарий к заданию
$private_comment = "private_comment_example"; // string | Приватный комментарий (видит только сам пользователь)
$confirmed = true; // bool | Подтвержденное задание (отправлено на выполнение)
$express = true; // bool | Экспресс задание
$archived = true; // bool | Задание в архиве
$rework = true; // bool | Задание на доработке
$rework_comment = "rework_comment_example"; // string | Комментарий доработки

try {
    $result = $apiInstance->editTask($id, $symbols_from, $symbols_to, $comment, $private_comment, $confirmed, $express, $archived, $rework, $rework_comment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaskApi->editTask: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID задания |
 **symbols_from** | **int**| Символов От | [optional]
 **symbols_to** | **int**| Символов До | [optional]
 **comment** | **string**| Комментарий к заданию | [optional]
 **private_comment** | **string**| Приватный комментарий (видит только сам пользователь) | [optional]
 **confirmed** | **bool**| Подтвержденное задание (отправлено на выполнение) | [optional]
 **express** | **bool**| Экспресс задание | [optional]
 **archived** | **bool**| Задание в архиве | [optional]
 **rework** | **bool**| Задание на доработке | [optional]
 **rework_comment** | **string**| Комментарий доработки | [optional]

### Return type

**object**

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTask**
> \Swagger\Client\Model\InlineResponse200 getTask($id)

Получение информации о задании

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\TaskApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 56; // int | ID задания

try {
    $result = $apiInstance->getTask($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaskApi->getTask: ', $e->getMessage(), PHP_EOL;
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

# **getTasks**
> object getTasks($include_data, $done, $confirmed, $archived, $limit, $page)

Получение списка заданий

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\TaskApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$include_data = true; // bool | С расширенными данными (по умолчанию) / Только ID
$done = true; // bool | Выполненные / не выполненные
$confirmed = true; // bool | Отправленные в работу / не отправленные
$archived = true; // bool | В архиве / не в архиве
$limit = 56; // int | Лимит (от 1 до 100 элементов)
$page = 56; // int | Номер страницы

try {
    $result = $apiInstance->getTasks($include_data, $done, $confirmed, $archived, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaskApi->getTasks: ', $e->getMessage(), PHP_EOL;
}
?>
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

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

