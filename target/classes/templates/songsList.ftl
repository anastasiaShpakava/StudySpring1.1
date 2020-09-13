<html>
<body>
<style>
    fieldset {
        border: 3px double #2799cc;
        border-radius: 3px;
        margin: 20px 0;
        padding: 20px;
    }
</style>


<div align="center">
    <fieldset>
        <table border="1">
            <legend>Songs</legend>
            <thead>
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Genre</td>
                <td>Perfomer</td>
            </tr>
            </thead>
            <#list compositions as composition>
                <tr>

                    <td>${composition.id}</td>
                    <td><a href="/songs/${composition.id}">
                            ${composition.name}
                        </a>
                    </td>
                    <td>${composition.type}</td>

                    <td><a href="/singers/${composition.singer.id}">
                            ${composition.singer.first_name + " " + composition.singer.last_name}</a></td>
                </tr>
            </#list>
        </table>
        <br>
        <div>
            <form action="/" method="get">
                <button type="submit">Back to Main</button>
            </form>
        </div>
    </fieldset>
</div>

</body>
</html>