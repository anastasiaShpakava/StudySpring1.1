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
                <#if singer.songs??>
                    <#list singer.songs as song>
                        <div>
                            <a href="/songs/${song.id}">
                                ${song.name}</a>
                            ${song.type}

                        </div>
                    </#list>
                </#if>
            </div>
        </#if>
    </div>
    <br>
    <div>
        <form action="/" method="get">
            <button type="submit">Back </button>
        </form>
    </div>
</fieldset>
</body>
</html>