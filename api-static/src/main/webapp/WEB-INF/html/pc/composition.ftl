
<#include "/pc/header.ftl" />
<link href="https://static.bevol.cn/pc/css/composition_info.css" rel="stylesheet">
<script src="${js!'https://static.bevol.cn/pc/js'}/component_info_2017010901.js" type="text/javascript"></script>
<!--面包屑导航-->
<div class="crumbs_nav">
    <h2 class="crumbs_nav_text"><a target="_self" href="/">首页</a> / <a target="_self" href="/composition">产品成分查询</a> / ${composition.title!}</h2>
</div>

<!--产品内容-->
<div class="main-cosmetics-class">
    <div class="cosmetics-info-left main-padding-4 margin-bottom-50 detail-tpl">
        <div class="component-info-title padding15">
            <h1 style="font-size:18px">${composition.title!}</h1>
            <p>英文名（INCI）：${composition.english!}</p>
        <#if composition.otherTitle??>
            <p>成分别名：${composition.otherTitle!}</p>
        </#if>
        <#if true>

            <p>CAS号：${composition.cas!}</p>
        </#if>
        <#if composition.useds??>
            <p>使用目的：
                <#list useds as ls>
                ${ls.title!}
                </#list>
            </p>
        </#if>
        <#if composition.safety??>
            <p>安全风险：
            ${composition.safety!}
            </p>
        </#if>
        <#if composition.acneRisk != "0">
            <p>致痘风险：
                <img src="${composition.acne_risk_image!}" style="top: 5px;position: relative;">
            </p>
        </#if>
        </div>

        <div class="cosmetics-info-title goods-tpl">
            <h2>成分简介（Ingredient Overview）</h2>
            <div class="component-info-box">
                <p>${composition.remark!}</p>
            </div>
        </div>

        <div class="cosmetics-info-title">
            <h2>含有此成分的产品：</h2>
            <div class="component-info-box">
                <ul>
                <#list items as ls>
                    <a href="/product/${ls.mid}.html">
                        <li>
                            <span class="span01">${ls_index+1}</span>
                            <span class="span02">${ls.title}</span>
                        </li>
                    </a>
                    <#if ls_index + 2 gt 10><#break/></#if>
                </#list>
                </ul>
            </div>
        </div>
    <#include "/pc/comment.ftl" />
    </div>

<#include "/pc/sidebar.ftl" />

</div>
<#include "/pc/footer.ftl" />