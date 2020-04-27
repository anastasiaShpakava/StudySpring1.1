<!DOCTYPE html>
<html lang="en">
<style>
    fieldset {
        border: 3px double #cc1793;
        border-radius: 3px;
        margin: 20px 0;
        padding: 20px;
    }
</style>
<head>
    <meta charset="UTF-8">
    <title>Singers</title>
</head>
<body>
<fieldset>
    <legend>Search:</legend>
    <div>
        <#if singer??>
            ${singer.toString()}
            <div>
                <#if singer.compositions??>
                    <#list singer.compositions as composition>
                        <div>
                            <a href="/songs/${composition.id}">
                                ${composition.name}</a>
                            ${composition.type}

                        </div>
                    </#list>
                </#if>
            </div>
        </#if>
    </div>
    <br>
    <div>
        <form action="/" method="get">
            <button type="submit">Back to Main</button>
        </form>
    </div>
</fieldset>
</body>
</html>