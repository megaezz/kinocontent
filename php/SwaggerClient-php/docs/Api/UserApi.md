# Swagger\Client\UserApi

All URIs are relative to *https://kinocontent.club/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editUser**](UserApi.md#edituser) | **PUT** /user | Редактирование пользователя
[**getUser**](UserApi.md#getuser) | **GET** /user | Получение информации о пользователе

# **editUser**
> object editUser($symbols_from, $symbols_to, $comment, $private_comment, $express)

Редактирование пользователя

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbols_from = 56; // int | Символов от
$symbols_to = 56; // int | Символов до
$comment = "comment_example"; // string | Комментарий по умолчанию
$private_comment = "private_comment_example"; // string | Комментарий для себя по умолчанию
$express = true; // bool | Экспресс задания по умолчанию

try {
    $result = $apiInstance->editUser($symbols_from, $symbols_to, $comment, $private_comment, $express);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->editUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbols_from** | **int**| Символов от | [optional]
 **symbols_to** | **int**| Символов до | [optional]
 **comment** | **string**| Комментарий по умолчанию | [optional]
 **private_comment** | **string**| Комментарий для себя по умолчанию | [optional]
 **express** | **bool**| Экспресс задания по умолчанию | [optional]

### Return type

**object**

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getUser**
> \Swagger\Client\Model\InlineResponse2001 getUser()

Получение информации о пользователе

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: ApiKeyAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-API-KEY', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-API-KEY', 'Bearer');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->getUser();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->getUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

