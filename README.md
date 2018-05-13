# OSRSFlippingBot

## Configuration

### VM Config

- VM Arguments:
  -Djava.search.path=out
  -Dsun.java2d.nodraw=true
  -Dcom.jagex.config=http://oldschool.runescape.com/l=en/jav_config.ws
  -Xmx512m
  -Xss2m
  -XX:CompileThreshold=1500
  -Xincgc
  -XX:+UseConcMarkSweepGC
  -XX:+UseParNewGC
  -javaagent: PATH_TO\RSBot-7070.jar
 
 Program Arguments: runescape
 
 Dependencies:
  - jagexappletviewer.jar (Available through OSRS website)
  - RSBot-7070.jar (Available through Powerbot website)
