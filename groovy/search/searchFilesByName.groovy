/**
A file has an version as suffix, I want to use pattern match to findout the bundles
org.eclipse.equinox.launcher_1.5.200.v20180922-1751.jar

$ groovy .\searchFilesByName.groovy
org.eclipse.equinox.launcher_1.5.200.v20180922-1751.jar

Refer to find operator
http://docs.groovy-lang.org/latest/html/documentation/core-operators.html#_find_operator
*/
def files = new FileNameFinder().getFileNames('E:\\eclipse\\4.10\\plugins', 'org.eclipse.equinox.launcher_*.jar')
files.each {
    println it
}

def files1 = new FileNameByRegexFinder().getFileNames('E:\\eclipse\\4.10\\plugins', /org\.eclipse\.equinox\.launcher_.*\.jar/)
files1.each {
    println it
}