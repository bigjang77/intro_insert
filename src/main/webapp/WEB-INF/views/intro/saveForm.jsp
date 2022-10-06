<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <title>Blog</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        </head>

        <body>
            <div class="container">
                <form>
                    <div class="mb-3 mt-3">
                        <input id="introTitle" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <div class="mb-3 mt-3">
                        <input id="introBirth" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <div class="mb-3 mt-3">
                        <input id="introTask" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <div class="mb-3 mt-3">
                        <input id="introSal" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <div class="mb-3 mt-3">
                        <input id="introWellfare" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <div class="mb-3 mt-3">
                        <input id="introContent" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <div class="mb-3 mt-3">
                        <input id="introLocation" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <div class="mb-3 mt-3">
                        <input id="introImage" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <div class="mb-3 mt-3">
                        <input id="jobId" type="text" class="form" placeholder="Enter 회사명">
                    </div>
                    <button id="btnInsert" type="button" class="btn btn-primary">등록완료</button>
                </form>
        </body>

        <script>
            $("#btnInsert").click(() => {
                insert();
            });

            function insert() {
                let data = {
                    introTitle: $("#introTitle").val(),
                    introBirth: $("#introBirth").val(),
                    introTask: $("#introTask").val(),
                    introSal: $("#introSal").val(),
                    introWellfare: $("#introWellfare").val(),
                    introContent: $("#introContent").val(),
                    introLocation: $("#introLocation").val(),
                    introImage: $("#introImage").val(),
                    jobId: $("#jobId").val()
                }
                console.log(data);
                $.ajax("/intro", {
                    type: "POST",
                    dataType: "json",
                    data: JSON.stringify(data), // http body에 들고갈 요청 데이터
                    headers: { // http header에 들고갈 요청 데이터
                        "Content-Type": "application/json; charset=utf-8"
                    }
                }).done((res) => {
                    if (res.code == 1) { // 성공
                        location.href = "/index";
                        console.log(data);
                    } else { // 실패
                        alert("기업소개등록에 실패하였습니다.");
                    }
                });
            }

        </script>