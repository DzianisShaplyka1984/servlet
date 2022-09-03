<%@ include file="header.jsp" %>

<%--    <c:choose>--%>
<%--        <c:when test="${my_cool_variable > 5 && a < 10}">--%>
<%--            Our session attribute a more then 5 and less then 10--%>
<%--        </c:when>--%>
<%--        <c:when test="${a > 10 && a < 100}">--%>
<%--            Our session attribute a more then 10 and less then 100--%>
<%--        </c:when>--%>
<%--        <c:otherwise>--%>
<%--            Our session attribute a less then 5--%>
<%--        </c:otherwise>--%>
<%--    </c:choose>--%>

    <br>

    <c:forEach items="${books}" var="book">
        ${book.title} <br>
    </c:forEach>

<%@ include file="footer.jsp" %>

