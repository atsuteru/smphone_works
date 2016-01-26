set JAVA_HOME=C:\sdk\jdk\i586\jdk1.7.0_71
cd %~dp0
%JAVA_HOME%\bin\java -cp "target/classes;target/smphone_works-0.0.1/WEB-INF/lib/*" jp.kk_brain.smphone.glassfish.Bootstrap
