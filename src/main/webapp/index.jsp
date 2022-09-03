<%@ include file="header.jsp" %>

        <h2>Hello World!</h2>
        <%
            int a = 2, b = 2;
            int c = a + b;
        %>
        <% Book book = new Book("My Title");
            User user = new User();
        %>
        <%= c%>
        <%= (String) session.getAttribute("user")%>
        <%= (Integer) session.getAttribute("a")%>
        <%= new java.util.Date() %>
        <input>
        Привет мир.

<%@ include file="footer.jsp" %>