/**
A file has an version as suffix, I want to use pattern match to findout the bundle name
org.eclipse.equinox.launcher_1.5.200.v20180922-1751.jar

$ groovy .\parseTokenInAnStringByPattern.groovy
org.eclipse.equinox.launcher

Refer to find operator
http://docs.groovy-lang.org/latest/html/documentation/core-operators.html#_find_operator
*/

def match = ( 'org.eclipse.equinox.launcher_1.5.200.v20180922-1751.jar' =~ /(.+)_.*\.jar/ )
if(match) // same as if(match.find())
    println match.group(1)
else 
    println 'nothing matched'