
# PostDetails

Details about the post. Multi file update

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the post. |  [optional]
**title** | **String** | The post’s title |  [optional]
**authorId** | **String** | The userId of the post’s author |  [optional]
**tags** | **List&lt;String&gt;** | The post’s tags |  [optional]
**url** | **String** | The URL of the post on Medium |  [optional]
**canonicalUrl** | **String** | The canonical URL of the post. If canonicalUrl was not specified in the creation of the post, this field will not be present. |  [optional]
**publishStatus** | **String** | The publish status of the post. |  [optional]
**publishedAt** | [**LocalDate**](LocalDate.md) | The post’s published date. If created as a draft, this field will not be present. |  [optional]
**license** | [**LicenseEnum**](#LicenseEnum) | The license of the post. |  [optional]
**licenseUrl** | **String** | The URL to the license of the post. |  [optional]


<a name="LicenseEnum"></a>
## Enum: LicenseEnum
Name | Value
---- | -----
ALL_RIGHTS_RESERVED | &quot;all-rights-reserved&quot;
CC_40_BY | &quot;cc-40-by&quot;
CC_40_BY_SA | &quot;cc-40-by-sa&quot;
CC_40_BY_ND | &quot;cc-40-by-nd&quot;
CC_40_BY_NC | &quot;cc-40-by-nc&quot;
CC_40_BY_NC_ND | &quot;cc-40-by-nc-nd&quot;
CC_40_BY_NC_SA | &quot;cc-40-by-nc-sa&quot;
CC_40_ZERO | &quot;cc-40-zero&quot;
PUBLIC_DOMAIN | &quot;public-domain&quot;



