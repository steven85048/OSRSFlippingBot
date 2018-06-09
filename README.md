# OSRSFlippingBot

## Description
An automated utility for Old School Runescape to flip bulk items for profit at the Grand Exchange. The idea is to use a large amount of clients to pass information through the network in order to determine the most profitable trade decisions that should be made at a certain point in time. 

There are currently three types of clients in development:
1. Margin sniffer: this client determines the price points for the top of the buy and sell stacks to determine the current margin for the items. Note that these values are VERY unreliable since there may only be a few items at the price point sniffed at that time while the median price may actually be far off, leading to a faulty investment if these values are used at face value. However, the data is gathered very quickly by this client, and these values are great for a cursory view of the current market state.
2. Margin tracker: this client provides another layer of specificity to the margin sniffer, but is unfortunately more slot-costly and slower in its data gathering process than the margin sniffer. The idea is to track different price points for different items (e.g. buy a law rune at 267, 268, and 269 gold) and take note of the rate in which these transactions are consumed. The amount of time it takes to move towards different price points as the market stabilizes can be used to estimate the true quantity of items that exist at each price point, partially relieving some of the danger of using the exact margins themselves.
3. Trade client: this client performs the actual trading, receiving trade orders from the backend and consuming these transactions. This client maintains a very tight data relationship with the backend, constantly updating its state that the backend uses to determine the ideal trade orders for that specific client. Offers by this client are effected by something called command decay, which is essentially a measure of how much time has passed after a command has been posted. If the command decay exceeds a threshold, the backend will cancel or modify this transaction with a better offer.

The clients are designed such that the logic in deciding what to do is very decoupled from the clients themselves -- the clients simply receive commands from the backend and execute them while the backend performs the majority of the heavy lifting.  

## Configuration

### VM Config

- VM Arguments:
  - -Djava.search.path=bin
  -Dsun.java2d.nodraw=true
  -Dcom.jagex.config=http://oldschool.runescape.com/l=en/jav_config.ws
  -Xmx512m
  -Xss2m
  -XX:CompileThreshold=1500
  -Xincgc
  -XX:+UseConcMarkSweepGC
  -XX:+UseParNewGC
  -javaagent:PATH_TO\RSBot-70(version).jar
 
 - Program Arguments: runescape
 
 - Main class : jagexappletviewer
 
 - Dependencies:
    - jagexappletviewer.jar (Available through OSRS website)
    - RSBot-7070.jar (Available through Powerbot website)

- Test account: h1210004@nwytg.com
