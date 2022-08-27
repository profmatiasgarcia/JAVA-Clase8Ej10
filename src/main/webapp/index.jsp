<%--
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2022 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los t�rminos de la
 * Licencia P�blica General de GNU seg�n es publicada por la Free Software Foundation, 
 * bien con la versi�n 3 de dicha Licencia o bien (seg�n su elecci�n) con cualquier versi�n posterior. 
 * Este programa se distribuye con la esperanza de que sea �til, pero SIN NINGUNA GARANT�A, 
 * incluso sin la garant�a MERCANTIL impl�cita o sin garantizar la CONVENIENCIA PARA UN PROP�SITO
 * PARTICULAR. V�ase la Licencia P�blica General de GNU para m�s detalles.
 * Deber�a haber recibido una copia de la Licencia P�blica General junto con este programa. 
 * Si no ha sido as� ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
--%>
<%@page contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>
    <title>Pagina de Inicio</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
 <body>
    <nav class="navbar navbar-expand-lg bg-secondary fixed-top" id="mainNav">
        <div class="container">
            <a class="navbar-brand js-scroll-trigger" href="https://www.profmatiasgarcia.com.ar">www.profmatiasgarcia.com.ar</a>
            <button class="navbar-toggler navbar-toggler-right font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">Menu <i class="fas fa-bars"></i></button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="https://twitter.com/profmatiasg">Twitter</a>
                    </li>
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="https://www.youtube.com/c/profmatiasgarcia">YouTube</a>
                    </li>
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="MainPageServlet">Iniciar Sesion</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <section class="masthead bg-primary text-white text-center">
        <div class="container d-flex align-items-center flex-column">
            <img class="masthead-avatar mb-2" src="images/pmatias.png" alt="">
            <h1 class="masthead-heading mb-0">Prof Matias Garcia</h1>
            <p class="pre-wrap masthead-subheading font-weight-light mb-0">Programaci�n III - ISP Joaqu�n V. Gonz�lez</p>
        </div>
    </section>
</body>
</html>