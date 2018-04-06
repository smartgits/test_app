<#include "/pc/header.ftl" />
<link rel="stylesheet" href="${css!'https://static.bevol.cn/pc/css'}/article_info.css">
<script src="${js!'https://static.bevol.cn/pc/js'}/article_info.js" type="text/javascript"></script>

<!--面包屑导航-->
<div class="crumbs_nav">
    <div class="crumbs_nav_text"><a href="/">首页</a> / <a href="/industry">行业资讯</a> / 资讯详情</div>
</div>

<!--产品内容-->
<div class="main-cosmetics-class">
    <div class="cosmetics-info-left main-padding-4">
        <div class="cosmetics-info-title padding15 margin-bottom-50">
            <!--文章内容BEGIN-->
            <div class="page_info_main01">
                <h1 class="page_main_title">${data.title!}</h1>
                <div class="page_line"></div>
                <div class="page_lists_box">
                    <ul>
                        <li>${data.tag!}</li></ul>
                    <div class="clear"></div>
                </div>
            </div>
            ${data.descp!}
        </div>
    </div>
     <#include "/pc/sidebar.ftl" />


</div>
<#include "/pc/footer.ftl" />
﻿
</body>
</html>