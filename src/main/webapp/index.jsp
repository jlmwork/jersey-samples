<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.logging.Logger" %>
<%@page import="java.util.logging.Handler" %>
<%@page import="java.util.logging.LogManager" %>
<html>
    <body>
        <h2>Jersey RESTful Web Application!</h2>
        <p><a href="webapi/myresource">Jersey resource</a>
        <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
            for more information on Jersey!

            <%
for (java.util.Enumeration<String> e = LogManager.getLogManager().getLoggerNames(); e.hasMoreElements();) {
Logger logger = Logger.getLogger(e.nextElement());
logger.setLevel(java.util.logging.Level.FINEST);

            %><%=logger.getName()%> - <%=logger.getLevel()%><br /><ul><%
Handler[] handlers = logger.getHandlers();
logger.setUseParentHandlers(true);
for(Handler handler : handlers) {
                %><li><%=handler%></li><%
}
                %></ul><%
if(handlers == null || handlers.length == 0) {
Handler chandler = new java.util.logging.ConsoleHandler();
logger.addHandler(chandler);
}
}

            %>
    </body>
</html>
