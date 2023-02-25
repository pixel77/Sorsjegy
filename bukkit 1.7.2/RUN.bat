@ECHO OFF
SET BINDIR=%~dp0
CD /D "%BINDIR%"
"%ProgramFiles%\Java\jre1.8.0_144\bin\java.exe" -Xincgc -Xmx1024m -Xms1024m -jar craftbukkit-1.7.2-R0.3.jar
PAUSE