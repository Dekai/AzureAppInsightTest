# AzureAppInsightTest

## Background
Create this sample project to reproduce Azure App service issue with Application Insights ~3, which is fresh Grails 3.0.17 application with a simple controller checkStatus.

## Steps to reproduce the issue
- Create an Azure App Service with Java 8 and Tomcat 8.5
- Deploy sample project to this Azure App service
- Using the following script to ping test controller checkStatus, here is the test URL from my test App service https://qkrtest.azurewebsites.net/qkr2/checkStatus/db
    ```bash
    #QkrTest
    COUNTER=1; while true; do  curl https://qkrtest.azurewebsites.net/qkr2/checkStatus/db ; echo " -- $COUNTER"; COUNTER=$(($COUNTER+1));  done
    ```
  It should always responses 200
- Enable Application Insights for the App service on Azure portal, run the test script again, it should have intermittent issue
- Change ApplicationInsightsAgent_EXTENSION_VERSION from ~3 to ~2, run the test script again, it should be always success