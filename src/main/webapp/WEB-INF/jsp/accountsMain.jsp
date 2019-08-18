<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<jsp:include page="fragments/headTag.jsp"/>
<link rel="stylesheet" href="webjars/datatables/1.10.9/css/jquery.dataTables.min.css">
<link rel="stylesheet" href="webjars/datetimepicker/2.3.4/jquery.datetimepicker.css">

<body>
<jsp:include page="fragments/bodyHeader.jsp"/>

<div class="jumbotron">
    <div class="container">
        <div class="shadow">
            <h3><fmt:message key="accounts.title"/></h3>

            <div class="view-box">

                <form:form method="post" class="form-horizontal" role="form" id="filter">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="startDate">From Date:</label>

                        <div class="col-sm-2">
                            <input name="startDate" id="startDate" class="date-picker">
                        </div>

                        <label class="control-label col-sm-2" for="endDate">To Date:</label>

                        <div class="col-sm-2">
                            <input name="endDate" id="endDate" class="date-picker">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="startTime">From Time:</label>

                        <div class="col-sm-2">
                            <input name="startTime" id="startTime" class="time-picker">
                        </div>

                        <label class="control-label col-sm-2" for="endTime">To Time:</label>

                        <div class="col-sm-2">
                            <input name="endTime" id="endTime" class="time-picker">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-8">
                            <button type="submit" class="btn btn-primary pull-right">Filter</button>
                        </div>
                    </div>
                </form:form>

                <a class="btn btn-sm btn-info" id="add"><fmt:message key="accounts.add"/></a>

                <table class="table table-striped display" id="datatable">
                    <thead>
                    <tr>
                        <th>#id</th>
                        <th>Date</th>
                        <th>Description</th>
                        <th>Description2</th>
                        <th>Calories</th>
                        <th>Login</th>
                        <th>Password</th>
                        <th>vk_id</th>
                        <th></th>
                        <th></th>
                    </tr>
                    </thead>
                </table>

            </div>
        </div>
    </div>
</div>
<jsp:include page="fragments/footer.jsp"/>

<div class="modal fade" id="editRow">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h2 class="modal-title"><fmt:message key="accounts.edit"/></h2>
            </div>
            <div class="modal-body">
                <form:form class="form-horizontal" method="post" id="detailsForm">

                    <div class="form-group">
                        <label for="id" class="control-label col-xs-3">#id</label>

                        <div class="col-xs-9">
                            <input class="form-control" id="id" name="id" placeholder="#id">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="dateTime" class="control-label col-xs-3">Date</label>

                        <div class="col-xs-9">
                            <input class="form-control" id="dateTime" name="dateTime" placeholder="Date">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="description" class="control-label col-xs-3">Description</label>

                        <div class="col-xs-9">
                            <input type="text" class="form-control" id="description" name="description"
                                   placeholder="Description">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="description2" class="control-label col-xs-3">Description2</label>

                        <div class="col-xs-9">
                            <input type="text" class="form-control" id="description2" name="description2"
                                   placeholder="Description2">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="calories" class="control-label col-xs-3">Calories</label>

                        <div class="col-xs-9">
                            <input type="number" class="form-control" id="calories" name="calories"
                                   placeholder="2000">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="login" class="control-label col-xs-3">Login</label>

                        <div class="col-xs-9">
                            <input type="text" class="form-control" id="login" name="login"
                                   placeholder="Login">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="password" class="control-label col-xs-3">Password</label>

                        <div class="col-xs-9">
                            <input type="text" class="form-control" id="password" name="password"
                                   placeholder="Password">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="vk_id" class="control-label col-xs-3">vk_id</label>

                        <div class="col-xs-9">
                            <input type="text" class="form-control" id="vk_id" name="vk_id"
                                   placeholder="vk_id">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-offset-3 col-xs-9">
                            <button type="submit" class="btn btn-primary">Save</button>
                        </div>
                    </div>

                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="webjars/datetimepicker/2.3.4/jquery.datetimepicker.js"></script>
<script type="text/javascript" src="webjars/datatables/1.10.9/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="webjars/noty/2.2.4/jquery.noty.packaged.min.js"></script>
<script type="text/javascript" src="resources/js/datatablesUtil.js"></script>
<script type="text/javascript" src="resources/js/mealDatatables.js"></script>
</html>