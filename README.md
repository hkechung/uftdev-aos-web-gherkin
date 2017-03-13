# LeanFT_Gherkin
Since the LFT jar files are not part of a public maven repo, maven projects will fail to grab the required jars.  This can be solved by connecting to a private maven repo or by adding the jar files to the local maven repo cache manually.

#Mac
The following maven goals were used to add the 14.0.0 lft libraries to the local maven cache (.m2) for IntelliJ 2016.3.4 on a Apple Mac
The lines below were executed using IntelliJ UI.

install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.sdk-standalone.jar" -DgroupId=com.hp.lft -DartifactId=sdk -Dversion=14.0.0 -Dpackaging=jar

install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.sdk-javadoc.jar" -DgroupId=com.hp.lft -DartifactId=sdk -Dclassifier=javadoc -Dversion=14.0.0 -Dpackaging=jar

install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.unittesting.jar" -DgroupId=com.hp.lft -DartifactId=unittesting -Dversion=14.0.0 -Dpackaging=jar

install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.verifications.jar" -DgroupId=com.hp.lft -DartifactId=verifications -Dversion=14.0.0 -Dpackaging=jar

install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.report.jar" -DgroupId=com.hp.lft -DartifactId=report -Dversion=14.0.0 -Dpackaging=jar

install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.reportbuilder-standalone.jar" -DgroupId=com.hp.lft -DartifactId=reportbuilder -Dversion=14.0.0 -Dpackaging=jar

If maven is installed as a standalone (rather than just a plugin ot IntelliJ) the following should work, though not verified *or* use the terminal screen in IntelliJ and execute the below commands.  Keep in mind it is assuming default installation of LFT 14.0

mvn install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.sdk-standalone.jar" -DgroupId=com.hp.lft -DartifactId=sdk -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.sdk-javadoc.jar" -DgroupId=com.hp.lft -DartifactId=sdk -Dclassifier=javadoc -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.unittesting.jar" -DgroupId=com.hp.lft -DartifactId=unittesting -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.verifications.jar" -DgroupId=com.hp.lft -DartifactId=verifications -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.report.jar" -DgroupId=com.hp.lft -DartifactId=report -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="/Applications/LeanFT/sdk/Java/com.hp.lft.reportbuilder-standalone.jar" -DgroupId=com.hp.lft -DartifactId=reportbuilder -Dversion=14.0.0 -Dpackaging=jar

#Ubuntu/Linux
Similar to Mac but make sure to change the path to the Jars to reflect where it is on your Linux machine.

#Windows
If on a windows machine, you should alter the path of where the jar file is located.
Below can be used for Windows LFT installation assuming it is for LFT 14 with the default installation of LFT

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Java\com.hp.lft.sdk-standalone.jar" -DgroupId=com.hp.lft -DartifactId=sdk -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Java\com.hp.lft.sdk-javadoc.jar" -DgroupId=com.hp.lft -DartifactId=sdk -Dclassifier=javadoc -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Java\com.hp.lft.unittesting.jar" -DgroupId=com.hp.lft -DartifactId=unittesting -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Java\com.hp.lft.verifications.jar" -DgroupId=com.hp.lft -DartifactId=verifications -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Java\com.hp.lft.report.jar" -DgroupId=com.hp.lft -DartifactId=report -Dversion=14.0.0 -Dpackaging=jar

mvn install:install-file -Dfile="C:\Program Files (x86)\HP\Unified Functional Testing\SDK\Java\com.hp.lft.reportbuilder-standalone.jar" -DgroupId=com.hp.lft -DartifactId=reportbuilder -Dversion=14.0.0 -Dpackaging=jar
