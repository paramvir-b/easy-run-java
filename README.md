Class Name containing main need to be specified.
Easy Run Java v1.0.2_beta1 - (v1.0.2_beta1)
--------------------------------------------
Run Java easily from shell command

Usage: easyrunjava [-c <jar_name/jar_dir>,<jar_name/jar_dir>...] [-m <email_id1>,<email_id2>...] [-p <prop_file1>,<prop_file2>...] class_name [args_to_program]


-c           Comma separated list of jar file names or jar dirs. Jar Name is added to the class path as is.
             If Jar Dir is specified then it will add all Jars under that folder. SUBFOLDERS ARE NOT SUPPORTED
-m           Comman separated list of email ids who will recieve mail if "Easy Run Java" fails
             Whether -m option is specified or not, the error is propagated to the caller, so that caller can also handle it
-p           Additional properties files which will be processed for evn variables.
             This feature will help pass evn variables to java program using java properties.
             Properties file can contain shell evn variables as well as any complex shell expression which shell can parse
             and rest it is same as normal java properties file. Example:
               com.test.env.tmpdir=$TMPDIR
class_name   Fully qualified java class name containing the main function
-s           Stub mode where it will not run the actual java program but prints everything else.
             Used for debugging and also for sanity testing the evn before running actual job.
JVM Args     JVM args are passed by setting EASY_RUN_JAVA_JVM_ARGS env variable. Still looking for some more elegant way to pass jvm args.
             Example: export EASY_RUN_JAVA_JVM_ARGS="-Xms256m -Xmx512m"

NOTE:        "Easy Run Java" supports passed properties with -p to be instance specific. Which means that every instance of 
             "Easy Run Java" will have its own copy of properties file.

Example:
`easyrunjava -p .,./dependency -m user.name@xyz.com com.example.HelloWorld`

In this case we are trying to run 'com.example.HelloWorld'
'.' contains HelloWorld-1.1.0-SNAPSHOT.jar ./dependency/ contains dependency jars

`easyrunjava -p ./HelloWorld-1.1.0-SNAPSHOT.jar,./dependency -m user.name@xyz.com com.example.HelloWorld`
 generate the same results as above one

