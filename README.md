Rate-Limiter Experiments
===================
> Born out of our experiment's in Cloud Foundry  
> Rate Limiters, Traffic shapers, Throttlers, Conditioners etc are being tested
> Bucket4J, Eureka Rate Limiter, 

+ **Multibandwidth** - Fast Collection with ability to pump out (evict) fixed number of elements per access, threads safe and implemented for an IOT application where sensory data eviction required at periodic intervals as fixed parts

Tests
=====
Multibandwidth - Blocking
------------
>60, TimeUnit.MINUTES, 1 : 1, TimeUnit.SECONDS, 1  

```java

multiBandwidthBucket = Buckets.withNanoTimePrecision()
.withLimitedBandwidth(60, TimeUnit.MINUTES, 1)
.withLimitedBandwidth(1, TimeUnit.SECONDS, 1)
.build();
```
 
Executed @ 13:20:35:031, Thread name : pool-1-thread-1  
Executed @ 13:20:36:035, Thread name : pool-1-thread-2  
Executed @ 13:20:37:040, Thread name : pool-1-thread-3  
Executed @ 13:20:38:044, Thread name : pool-1-thread-4  
Executed @ 13:20:39:049, Thread name : pool-1-thread-5  
Executed @ 13:20:40:052, Thread name : pool-1-thread-6  
Executed @ 13:20:41:056, Thread name : pool-1-thread-7  
Executed @ 13:20:42:059, Thread name : pool-1-thread-8  
Executed @ 13:20:43:063, Thread name : pool-1-thread-9  
Executed @ 13:20:44:064, Thread name : pool-1-thread-10  
Executed @ 13:20:45:065, Thread name : pool-1-thread-11  
Executed @ 13:20:46:070, Thread name : pool-1-thread-12  
Executed @ 13:20:47:074, Thread name : pool-1-thread-13  
Executed @ 13:20:48:079, Thread name : pool-1-thread-14  
Executed @ 13:20:49:083, Thread name : pool-1-thread-15  
Executed @ 13:20:50:084, Thread name : pool-1-thread-16  
Executed @ 13:20:51:086, Thread name : pool-1-thread-17  
Executed @ 13:20:52:091, Thread name : pool-1-thread-18  
Executed @ 13:20:53:093, Thread name : pool-1-thread-19  
Executed @ 13:20:54:097, Thread name : pool-1-thread-20  
Executed @ 13:20:55:099, Thread name : pool-1-thread-21  
Executed @ 13:20:56:104, Thread name : pool-1-thread-22  
Executed @ 13:20:57:107, Thread name : pool-1-thread-23  
Executed @ 13:20:58:113, Thread name : pool-1-thread-24  
Executed @ 13:20:59:114, Thread name : pool-1-thread-25  
Executed @ 13:21:00:117, Thread name : pool-1-thread-26  

...

Executed @ 13:23:15:568, Thread name : pool-1-thread-161  


Singlebandwidth - NonBlocking (Rejecting)
------------
>10, TimeUnit.SECONDS, 1  

```java

singleBandwidthBucket = Buckets.withNanoTimePrecision()
.withLimitedBandwidth(10, TimeUnit.SECONDS, 1)
.build();  
```

Executed @ 15:13:44:056, Thread name : pool-1-thread-1  
Executed @ 15:13:44:057, Thread name : pool-1-thread-9  
Executed @ 15:13:44:056, Thread name : pool-1-thread-3  
Executed @ 15:13:44:056, Thread name : pool-1-thread-2  
Executed @ 15:13:44:057, Thread name : pool-1-thread-8  
Executed @ 15:13:44:057, Thread name : pool-1-thread-5  
Executed @ 15:13:44:057, Thread name : pool-1-thread-7  
Executed @ 15:13:44:056, Thread name : pool-1-thread-4  
Executed @ 15:13:44:057, Thread name : pool-1-thread-6  
Executed @ 15:13:44:057, Thread name : pool-1-thread-10  
Rejected @ 15:13:44:057, Thread name : main  
Rejected @ 15:13:44:059, Thread name : main  
Rejected @ 15:13:44:059, Thread name : main  
Rejected @ 15:13:44:059, Thread name : main  
Rejected @ 15:13:44:059, Thread name : main  
Rejected @ 15:13:44:059, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:060, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  
Rejected @ 15:13:44:061, Thread name : main  