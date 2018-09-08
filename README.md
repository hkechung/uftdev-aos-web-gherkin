# leanft-gherkin
Since the LeanFT jar files are not part of a public maven repo, maven projects will fail to grab the required jars.  This can be solved by connecting to a private maven repo or by adding the jar files to the local maven repo cache manually.  More information can befound visiting https://admhelp.microfocus.com/leanft/en/14.50/HelpCenter/Content/HowTo/prerequ-maven.htm

Note: The Selenium jars are not used as part of this project but can be added using normal maven practices by adding the dependency to your pom file.  The publc definition can be found https://search.maven.org/search?q=a:leanft-selenium-java-sdk

The below assume you have performed a default installation of UFT Pro (LeanFT).  You would just need to adjust the path to the jar files where appropriate.  As a note for future use, change the version number to match the version of LeanFT that you are using.

# Mac
The following maven goals were used to add the 14.50.0 lft libraries to the local maven cache (.m2) for IntelliJ 2017.3 on a Apple Mac
The lines below were executed using IntelliJ UI.

````
install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.common-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.common-14.50.0-pom.xml

install:install-file -Dfile=/Applications/LeanFT/sdk/Mavencom.hp.lft.report-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.report-14.50.0-pom.xml

install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/ccom.hp.lft.reportbuilder-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.reportbuilder-14.50.0-pom.xml

install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.sdk-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.sdk-14.50.0-pom.xml

install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.unittesting-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.unittesting-14.50.0-pom.xml

install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.verifications-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.verifications-14.50.0-pom.xml

install:install-file  -Dfile=/Applications/LeanFT/Tools/appmodel-code-generator/Java/appmodel-code-generator-helper.jar  -DpomFile=/Applications/LeanFT/Tools/appmodel-code-generator/Java/appmodel-code-generator-helper-pom.xml

install:install-file  -Dfile=/Applications/LeanFT/Tools/appmodel-code-generator/Java/appmodel-code-generator-mojo-14.50.0.jar  -DpomFile=/Applications/LeanFT/Tools/appmodel-code-generator/Java/appmodel-code-generator-mojo-14.50.0-pom.xml
````

If maven is installed as a standalone (rather than just a plugin ot IntelliJ) the following should work, though not verified *or* use the terminal screen in IntelliJ and execute the below commands.  Keep in mind it is assuming default installation of LFT 14.0

```
mvn install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.common-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.common-14.50.0-pom.xml

mvn install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.report-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.report-14.50.0-pom.xml

mvn install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.reportbuilder-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.reportbuilder-14.50.0-pom.xml

mvn install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.sdk-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.sdk-14.50.0-pom.xml

mvn install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.unittesting-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.unittesting-14.50.0-pom.xml

mvn install:install-file -Dfile=/Applications/LeanFT/sdk/Maven/com.hp.lft.verifications-14.50.0.jar -DpomFile=/Applications/LeanFT/sdk/Maven/com.hp.lft.verifications-14.50.0-pom.xml

mvn install:install-file  -Dfile=/Applications/LeanFT/Tools/appmodel-code-generator/Java/appmodel-code-generator-helper.jar  -DpomFile=/Applications/LeanFT/Tools/appmodel-code-generator/Java/appmodel-code-generator-helper-pom.xml

mvn install:install-file  -Dfile=/Applications/LeanFT/Tools/appmodel-code-generator/Java/appmodel-code-generator-mojo-14.50.0.jar  -DpomFile=/Applications/LeanFT/Tools/appmodel-code-generator/Java/appmodel-code-generator-mojo-14.50.0-pom.xml
```

# Ubuntu/Linux
```
/usr/bin/mvn install:install-file -Dfile=/opt/leanft/sdk/Maven/com.hp.lft.common-14.50.0.jar -DpomFile=/opt/leanft/sdk/Maven/com.hp.lft.common-14.50.0-pom.xml

/usr/bin/mvn install:install-file -Dfile=/opt/leanft/sdk/Maven/com.hp.lft.report-14.50.0.jar -DpomFile=/opt/leanft/sdk/Maven/com.hp.lft.report-14.50.0-pom.xml

/usr/bin/mvn install:install-file -Dfile=/opt/leanft/sdk/Maven/com.hp.lft.reportbuilder-14.50.0.jar -DpomFile=/opt/leanft/sdk/Maven/com.hp.lft.reportbuilder-14.50.0-pom.xml

/usr/bin/mvn install:install-file -Dfile=/opt/leanft/sdk/Maven/com.hp.lft.sdk-14.50.0.jar -DpomFile=/opt/leanft/sdk/Maven/com.hp.lft.sdk-14.50.0-pom.xml

/usr/bin/mvn install:install-file -Dfile=/opt/leanft/sdk/Maven/com.hp.lft.unittesting-14.50.0.jar -DpomFile=/opt/leanft/sdk/Maven/com.hp.lft.unittesting-14.50.0-pom.xml

/usr/bin/mvn install:install-file -Dfile=/opt/leanft/sdk/Maven/com.hp.lft.verifications-14.50.0.jar -DpomFile=/opt/leanft/sdk/Maven/com.hp.lft.verifications-14.50.0-pom.xml

/usr/bin/mvn install:install-file  -Dfile=/opt/leanft//Tools/appmodel-code-generator/Java/appmodel-code-generator-helper.jar  -DpomFile=/opt/leanft//Tools/appmodel-code-generator/Java/appmodel-code-generator-helper-pom.xml

/usr/bin/mvn install:install-file  -Dfile=/opt/leanft//Tools/appmodel-code-generator/Java/appmodel-code-generator-mojo-14.50.0.jar  -DpomFile=/opt/leanft//Tools/appmodel-code-generator/Java/appmodel-code-generator-mojo-14.50.0-pom.xml
```

# Windows
If on a windows machine, you should alter the path of where the jar file is located.
Below can be used for Windows LFT installation assuming it is for LFT 14 with the default installation of LFT
```
mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.common-14.50.0.jar" -DpomFile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.common-14.50.0-pom.xml"

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.report-14.50.0.jar" -DpomFile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.report-14.50.0-pom.xml"

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.reportbuilder-14.50.0.jar" -DpomFile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.reportbuilder-14.50.0-pom.xml"

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.sdk-14.50.0.jar" -DpomFile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.sdk-14.50.0-pom.xml"

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.unittesting-14.50.0.jar" -DpomFile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.unittesting-14.50.0-pom.xml"

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.verifications-14.50.0.jar" -DpomFile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Maven\com.hp.lft.verifications-14.50.0-pom.xml"

mvn install:install-file  -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\Tools\appmodel-code-generator/Java/appmodel-code-generator-helper.jar"  -DpomFile="C:\Program Files (x86)\HP\Unified Functional Testing\Tools\appmodel-code-generator/Java/appmodel-code-generator-helper-pom.xml"

mvn install:install-file  -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\Tools\appmodel-code-generator-mojo-14.50.0.jar"  -DpomFile="C:\Program Files (x86)\HP\Unified Functional Testing\Tools\appmodel-code-generator/Java/appmodel-code-generator-mojo-14.50.0-pom.xml"
```
# Process to change the test

Perform the following:

1. git clone https://github.com/admpresales/leanft-gherkin.git
1. git checkout -b \<mybranchname\>
1. Make desired changes
1. git commit
1. git push
1. Then from https://github.hpe.com/admpresales/leanft-gherkin perform a pull request on the branch
