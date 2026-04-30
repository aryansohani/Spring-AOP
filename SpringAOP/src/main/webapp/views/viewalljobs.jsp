<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Post List</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="/home">Telusko Job Portal Web App</a>

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <!-- ✅ FIXED -->
                <li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="/viewalljobs">All Jobs</a></li>
                <li class="nav-item"><a class="nav-link" href="https://telusko.com/">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h2 class="mb-4 text-center font-weight-bold">Job Post List</h2>

    <c:if test="${empty jobs}">
        <h4 class="text-center text-danger">No Jobs Available</h4>
    </c:if>

    <div class="row row-cols-2">

        <!-- ✅ FIXED VARIABLE -->
        <c:forEach var="jobPost" items="${jobs}">

            <div class="col mb-4">
                <div class="card border-dark bg-dark text-white">
                    <div class="card-body">

                        <h5 class="card-title">${jobPost.postProfile}</h5>

                        <p><strong>Description:</strong> ${jobPost.postDesc}</p>

                        <p><strong>Experience Required:</strong>
                            ${jobPost.reqExperience} years
                        </p>

                        <p><strong>Tech Stack:</strong></p>

                        <ul>
                            <c:forEach var="tech" items="${jobPost.postTechStack}">
                                <li>${tech}</li>
                            </c:forEach>
                        </ul>

                    </div>
                </div>
            </div>

        </c:forEach>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>