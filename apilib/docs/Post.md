
# Post

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | The title of the post. Note that this title is used for SEO and when rendering the post as a listing, but will not appear in the actual post—for that, the title must be specified in the content field as well. Titles longer than 100 characters will be ignored. In that case, a title will be synthesized from the first content in the post when it is published. | 
**contentFormat** | **String** | The format of the \&quot;content\&quot; field. There are two valid values, \&quot;html\&quot;, and \&quot;markdown\&quot; | 
**content** | **String** | The body of the post, in a valid, semantic, HTML fragment, or Markdown. Further markups may be supported in the future. For a full list of accepted HTML tags, see here. If you want your title to appear on the post page, you must also include it as part of the post content. | 
**tags** | **List&lt;String&gt;** | Tags to classify the post. Only the first three will be used. Tags longer than 25 characters will be ignored. |  [optional]
**canonicalUrl** | **String** | The original home of this content, if it was originally published elsewhere. |  [optional]
**publishStatus** | [**PublishStatusEnum**](#PublishStatusEnum) | The status of the post. Valid values are &#x60;public&#x60;, &#x60;draft&#x60;, or &#x60;unlisted&#x60;. The default is &#x60;public&#x60;. |  [optional]
**license** | [**LicenseEnum**](#LicenseEnum) | The license of the post. Valid values are &#x60;all-rights-reserved&#x60;, &#x60;cc-40-by&#x60;, &#x60;cc-40-by-sa&#x60;, &#x60;cc-40-by-nd&#x60;, &#x60;cc-40-by-nc&#x60;, &#x60;cc-40-by-nc-nd&#x60;, &#x60;cc-40-by-nc-sa&#x60;, &#x60;cc-40-zero&#x60;, &#x60;public-domain&#x60;. The default is &#x60;all-rights-reserved&#x60;. |  [optional]


<a name="PublishStatusEnum"></a>
## Enum: PublishStatusEnum
Name | Value
---- | -----
PUBLIC | &quot;public&quot;
DRAFT | &quot;draft&quot;
UNLISTED | &quot;unlisted&quot;


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



