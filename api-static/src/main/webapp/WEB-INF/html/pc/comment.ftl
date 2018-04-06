<#if comments?? && comments?size gt 0>
    <div class="cosmetics-info-title margin-bottom-50">
        <h2>用户点评</h2>
        <div class="cosmetics-info-box">
            <#list comments as comment>
                <div class="xxs-info-box line">
                    <div class="xxs-info-title">
                        <div class="xxs-info-title-img">
                            <#if comment.userInfo??>
                                <img src="${comment.userInfo.headimgurl!}" onerror="this.src= '${img+'/morenyixiu.png'}'" class="img_z"/>
                            </#if>
                            </div>
                        <div class="xxs-info-title-main">
                            <p class="p1"><#if comment.userInfo??>${comment.userInfo.nickname!}</#if></p>
                            <#if comment.skinResults??>
                                <div class="p2">
                                    <ul>
                                        <li>${comment.skinResult1!}</li>
                                        <li>${comment.skinResult2!}</li>
                                        <li>${comment.skinResult3!}</li>
                                        <li>${comment.skinResult4!}</li>
                                    </ul>
                                </div>
                            </#if>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="xxs-info-content">
                        ${comment.content!}
                    </div>
                </div>
            </#list>
        </div>
        <div class="download-app">
            <a href="javascript:void(0);">查看更多评论点击下载美丽修行APP</a>
        </div>
    </div>
    <div class="download-app-ewm">
        <div class="download-app-ewm-img">
            <img src="${img}/pc/images/pcpicture/comment_qrcode.png" class="img_z">
        </div>
        <div class="download-app-ewm-title">
            扫码下载美丽修行APP
        </div>
    </div>
</#if>