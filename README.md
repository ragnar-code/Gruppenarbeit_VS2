# Gruppenarbeit_VS2


# Members

Beyel, Buchleither , Doerler, Penner. 


## 1) Threads Future


## 2) Threads Parkhaus

// Kommentar 


## 3) Übung Network 2




## 4) Praktikum Markup und HTML

### Aufgabe 1a:

Wie werden die Felder an den Server übermittelt? Wie sind Umlaute codiert? Warum? <br>

Felder werden mittels zwei Methoden übertragen. Entweder GET, damit hat man eine Übersicht unserer Informationen im URL der Seite an der die Daten geschickt werden, oder die POST Methode mit der die Daten  sicherer ankommen (für Passworte zb.).
Umlaute werden durch das “%” Symbol und zwei hexadezimal Zeichen. Damit werden die User Informationen am ersten Blick geschützt. <br> <br>


Wozu dient das fieldset - Element? Wie wird der «Titel» eines Fieldsets definiert? <br>

Fieldset ermöglicht mehrere Elemente eines Formular zu gruppieren. Der Titel eines fieldset wir mit einer Legende definiert <br> <br>


Was geschieht, wenn Sie ein Label mit der Maus anklicken? <br>

Damit wird das bezogene Input-Element (Checkbox, Textfield, Radio Button, usw…) angesprochen und wird gehighlightet. <br> <br>


Wie werden die label -Elemente mit den Eingabefeldern verknüpft? <br>

Man bezieht das Label Element “<label for=”id Name”> auf den id des Input Elements. <br> <br>


Wozu dient das name -Attribut? Kann es weggelassen werden? <br>

Der Name eines Input Element kann nicht weggelassen werden wenn man ein Label also ein “Titel” für sein Element will. Im fall wo man keinen “Titel” haben will kann man das Input Element alleine lassen. <br> <br>


Wie kann man Eingabewerte in den Feldern vordefinieren? <br>

Man kann dem Input Element ein value geben. Zum Beispiel den value = “text” zu einen Textfield, hiermit wird auf dem Textfeld schon “text” geschrieben bevor der Benutzer etwas schreiben konnte. <br> <br>


Studieren Sie die vom serverseitigen Script ausgegebenen Environment-Variablen. Welche Informationen kann man diesen entnehmen? Wird auch ausgegeben, von welchem Computer die Formulardaten geschickt wurden? <br>

Bei der validierung des Formulars, werden viele variablen ausgegeben, man erhält zunächst den Login und Passwort des Benutzers. Aber auch den Port von welchem die Anfrage kommt, den Internet Explorer der benutzt wird und weitere nicht relevante Informationen. <br> <br>


Analysieren Sie im Browser mit Hilfe der Entwicklertools – Tab Netzwork den Request und den Response: Wozu dienen die Angaben: user-agent, accept, host, content-length, content-type, scheme, method, status <br>

Diese Daten geben spezifische Informationen zu der verbindung zwischen Client und Server, zb bei method kann man sehen das man durch einen Post Informationen geschickt hat. Der Content Type sagt uns das es sich um ein DoKument handelt. Content-length gibt uns die größe des Dokuments. <br> <br>


### Aufgabe 1b:

Was ist der Unterschied bei der Übertragung der Daten? Verwenden Sie die Browser Entwicklertools, um den Datenaustausch zwischen dem Browser und Server zu beobachten. <br>

Mit der GET Methode sind wir von der Sicherheitsseite her limitiert da wir die Informationen für den URL encoden müssen. Mit der POST Methode ist man etwas schneller bei der Verbindung. <br> <br>


Würden Sie für dieses Formular GET oder POST bevorzugen? Warum? <br>

Für so ein Formular würde ich de POST Methode bevorzugen, da man keine erscheinung (encoded oder nicht) auf den URL sehen kann.  <br> <br>


### Aufgabe 1c:

Wie werden mehrere Werte bei einer Mehrfachselektion übertragen? Verwenden Sie die Entwicklertools des Browsers. <br>

Die Werte werden als ein Array übertragen und erscheinen folgender Masse -> "Kurse":["Kurs1","Kurs2","Kurs3"] <br> <br>



Ergänzen Sie noch ein input -Feld vom Typ hidden und geben diesem ein name - und ein value - Attribut. Kommt der Wert ebenfalls am Server an? Wozu sind Felder vom Typ hidden gut und zu welchem Zweck können sie verwendet werden? <br>

Der Wert eines Hidden Attributes wird ebenfalls am Server ankommen. Solch ein Element soll nicht als Sicherheits Element benutzt werden, es ist nur für Programmierer nützlich wenn sie den Entwicklertool benutzen. <br> <br>


### Aufgabe 1d:
Wie können die Formularfelder validiert werden? <br>

Formular Elemente werden automatisch validiert indem man zum nächsten Element geht, sie können aber noch modifiziert werden. Wenn Die Daten Submittet werden, sind Sie automatisch gespeichert. <br> <br>


Wie können Sie Pflichtfelder definieren? <br>

Dazu muss man beim Input das Attribut “required” definieren. <br> <br>


Wird das Formular bei Validierungsfehlern übermittelt? <br>

Nein, der Input übermittelt automatisch ein error Message bei einer falschen Angabe. <br> <br>


Wie können Sie die Felder mit einem Musterinhalt belegen, der entfernt wird, sobald Sie das Feld anwählen? <br>

Dafür muss ein Placeholder angegeben werden. Bei einem Radio kann man auf einen gechekten Feld am Anfang anzeigen. <br> <br>


Wie können Sie den Fokus/Cursor nach dem Laden der Seite automatisch in einem bestimmten Feld positionieren? (ohne JavaScript) <br>

Das target Attribut bei der definierung des Form kann dieses kontrollieren. <br> <br>

### Aufgabe 2:

Das Logo finden Sie im HTML5 Formular. 

Testen Sie mit verschiedenen Browsern, ob die Formel angezeigt wird. Mindestens in aktuellen Firefox-Browsern (sowie im Safari Browser - MacOS) sollte es funktionieren. <br>

Die Anzeige funktionniert in allen meine Browsern. <br> <br>


Sehen Sie sich den Quellcode von math.html an. Können Sie die einzelnen Elemente der Formel identifizieren? Ändern Sie die Formel leicht ab und überprüfen Sie, ob die Anzeige wie erwartet ausfällt. <br>

Den Quellcode kann man als einzelne Zeichen ansehen, um leichte Änderungen zu machen muss man zuerst den XML code als HTML code umsetzen und bearbeiten. <br> <br>


Da nicht alle Browser mit MathML umgehen können, gibt es JavaScript-Bibliotheken, die diese Lücke füllen. In math.html sind zwei noch auskommentierte script -Elemente enthalten, die die MathJax-Bibliothek laden. Probieren Sie beide Varianten (einzeln, nicht beide zusammen) in verschiedenen Browsern aus. In der ersten Variante wird die Formel für die Darstellung in SVG umgewandelt, in der zweiten wird HTML und CSS für die Darstellung verwendet <br>

Beide Darstellungen funktionieren perfekt. <br> <br>


## 5) Skripte Datenbanken Praktikum 2-4


