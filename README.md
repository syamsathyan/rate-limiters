Rate-Limiter Experiments
===================
> Born out of our experiment's in Cloud Foundry  
> Rate Limiters, Traffic shapers, Throttlers, Conditioners etc are being tested
> Bucket4J, Eureka Rate Limiter, 

+ **Multibandwidth** - Fast Collection with ability to pump out (evict) fixed number of elements per access, threads safe and implemented for an IOT application where sensory data eviction required at periodic intervals as fixed parts

Tests
=====
Multibandwidth
------------
60, TimeUnit.MINUTES, 1 : 1, TimeUnit.SECONDS, 1
