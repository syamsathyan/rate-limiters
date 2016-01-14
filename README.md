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

Running com.cxe.commons.qos.rate.RateLimiterTest
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
Executed @ 13:21:01:123, Thread name : pool-1-thread-27
Executed @ 13:21:02:124, Thread name : pool-1-thread-28
Executed @ 13:21:03:128, Thread name : pool-1-thread-29
Executed @ 13:21:04:131, Thread name : pool-1-thread-30
Executed @ 13:21:05:131, Thread name : pool-1-thread-31
Executed @ 13:21:06:133, Thread name : pool-1-thread-32
Executed @ 13:21:07:136, Thread name : pool-1-thread-33
Executed @ 13:21:08:140, Thread name : pool-1-thread-34
Executed @ 13:21:09:145, Thread name : pool-1-thread-35
Executed @ 13:21:10:147, Thread name : pool-1-thread-36
Executed @ 13:21:11:150, Thread name : pool-1-thread-37
Executed @ 13:21:12:153, Thread name : pool-1-thread-38
Executed @ 13:21:13:156, Thread name : pool-1-thread-39
Executed @ 13:21:14:157, Thread name : pool-1-thread-40
Executed @ 13:21:15:161, Thread name : pool-1-thread-41
Executed @ 13:21:16:164, Thread name : pool-1-thread-42
Executed @ 13:21:17:167, Thread name : pool-1-thread-43
Executed @ 13:21:18:168, Thread name : pool-1-thread-44
Executed @ 13:21:19:173, Thread name : pool-1-thread-45
Executed @ 13:21:20:177, Thread name : pool-1-thread-46
Executed @ 13:21:21:182, Thread name : pool-1-thread-47
Executed @ 13:21:22:186, Thread name : pool-1-thread-48
Executed @ 13:21:23:191, Thread name : pool-1-thread-49
Executed @ 13:21:24:195, Thread name : pool-1-thread-50
Executed @ 13:21:25:201, Thread name : pool-1-thread-51
Executed @ 13:21:26:204, Thread name : pool-1-thread-52
Executed @ 13:21:27:207, Thread name : pool-1-thread-53
Executed @ 13:21:28:207, Thread name : pool-1-thread-54
Executed @ 13:21:29:211, Thread name : pool-1-thread-55
Executed @ 13:21:30:215, Thread name : pool-1-thread-56
Executed @ 13:21:31:219, Thread name : pool-1-thread-57
Executed @ 13:21:32:222, Thread name : pool-1-thread-58
Executed @ 13:21:33:226, Thread name : pool-1-thread-59
Executed @ 13:21:34:232, Thread name : pool-1-thread-60
Executed @ 13:21:35:237, Thread name : pool-1-thread-61
Executed @ 13:21:36:241, Thread name : pool-1-thread-62
Executed @ 13:21:37:243, Thread name : pool-1-thread-63
Executed @ 13:21:38:248, Thread name : pool-1-thread-64
Executed @ 13:21:39:252, Thread name : pool-1-thread-65
Executed @ 13:21:40:256, Thread name : pool-1-thread-66
Executed @ 13:21:41:258, Thread name : pool-1-thread-67
Executed @ 13:21:42:261, Thread name : pool-1-thread-68
Executed @ 13:21:43:264, Thread name : pool-1-thread-69
Executed @ 13:21:44:268, Thread name : pool-1-thread-70
Executed @ 13:21:45:272, Thread name : pool-1-thread-71
Executed @ 13:21:46:273, Thread name : pool-1-thread-72
Executed @ 13:21:47:277, Thread name : pool-1-thread-73
Executed @ 13:21:48:281, Thread name : pool-1-thread-74
Executed @ 13:21:49:285, Thread name : pool-1-thread-75
Executed @ 13:21:50:290, Thread name : pool-1-thread-76
Executed @ 13:21:51:291, Thread name : pool-1-thread-77
Executed @ 13:21:52:296, Thread name : pool-1-thread-78
Executed @ 13:21:53:298, Thread name : pool-1-thread-79
Executed @ 13:21:54:300, Thread name : pool-1-thread-80
Executed @ 13:21:55:301, Thread name : pool-1-thread-81
Executed @ 13:21:56:306, Thread name : pool-1-thread-82
Executed @ 13:21:57:308, Thread name : pool-1-thread-83
Executed @ 13:21:58:310, Thread name : pool-1-thread-84
Executed @ 13:21:59:315, Thread name : pool-1-thread-85
Executed @ 13:22:00:319, Thread name : pool-1-thread-86
Executed @ 13:22:01:323, Thread name : pool-1-thread-87
Executed @ 13:22:02:326, Thread name : pool-1-thread-88
Executed @ 13:22:03:330, Thread name : pool-1-thread-89
Executed @ 13:22:04:333, Thread name : pool-1-thread-90
Executed @ 13:22:05:338, Thread name : pool-1-thread-91
Executed @ 13:22:06:339, Thread name : pool-1-thread-92
Executed @ 13:22:07:340, Thread name : pool-1-thread-93
Executed @ 13:22:08:346, Thread name : pool-1-thread-94
Executed @ 13:22:09:350, Thread name : pool-1-thread-95
Executed @ 13:22:10:352, Thread name : pool-1-thread-96
Executed @ 13:22:11:356, Thread name : pool-1-thread-97
Executed @ 13:22:12:358, Thread name : pool-1-thread-98
Executed @ 13:22:13:359, Thread name : pool-1-thread-99
Executed @ 13:22:14:364, Thread name : pool-1-thread-100
Executed @ 13:22:15:368, Thread name : pool-1-thread-101
Executed @ 13:22:16:371, Thread name : pool-1-thread-102
Executed @ 13:22:17:377, Thread name : pool-1-thread-103
Executed @ 13:22:18:380, Thread name : pool-1-thread-104
Executed @ 13:22:19:381, Thread name : pool-1-thread-105
Executed @ 13:22:20:383, Thread name : pool-1-thread-106
Executed @ 13:22:21:387, Thread name : pool-1-thread-107
Executed @ 13:22:22:390, Thread name : pool-1-thread-108
Executed @ 13:22:23:393, Thread name : pool-1-thread-109
Executed @ 13:22:24:396, Thread name : pool-1-thread-110
Executed @ 13:22:25:401, Thread name : pool-1-thread-111
Executed @ 13:22:26:404, Thread name : pool-1-thread-112
Executed @ 13:22:27:408, Thread name : pool-1-thread-113
Executed @ 13:22:28:410, Thread name : pool-1-thread-114
Executed @ 13:22:29:414, Thread name : pool-1-thread-115
Executed @ 13:22:30:415, Thread name : pool-1-thread-116
Executed @ 13:22:31:419, Thread name : pool-1-thread-117
Executed @ 13:22:32:423, Thread name : pool-1-thread-118
Executed @ 13:22:33:427, Thread name : pool-1-thread-119
Executed @ 13:22:34:429, Thread name : pool-1-thread-120
Executed @ 13:22:35:433, Thread name : pool-1-thread-121
Executed @ 13:22:36:437, Thread name : pool-1-thread-122
Executed @ 13:22:37:439, Thread name : pool-1-thread-123
Executed @ 13:22:38:442, Thread name : pool-1-thread-124
Executed @ 13:22:39:447, Thread name : pool-1-thread-125
Executed @ 13:22:40:447, Thread name : pool-1-thread-126
Executed @ 13:22:41:453, Thread name : pool-1-thread-127
Executed @ 13:22:42:456, Thread name : pool-1-thread-128
Executed @ 13:22:43:457, Thread name : pool-1-thread-129
Executed @ 13:22:44:458, Thread name : pool-1-thread-130
Executed @ 13:22:45:462, Thread name : pool-1-thread-131
Executed @ 13:22:46:466, Thread name : pool-1-thread-132
Executed @ 13:22:47:471, Thread name : pool-1-thread-133
Executed @ 13:22:48:476, Thread name : pool-1-thread-134
Executed @ 13:22:49:480, Thread name : pool-1-thread-135
Executed @ 13:22:50:484, Thread name : pool-1-thread-136
Executed @ 13:22:51:489, Thread name : pool-1-thread-137
Executed @ 13:22:52:493, Thread name : pool-1-thread-138
Executed @ 13:22:53:498, Thread name : pool-1-thread-139
Executed @ 13:22:54:502, Thread name : pool-1-thread-140
Executed @ 13:22:55:504, Thread name : pool-1-thread-141
Executed @ 13:22:56:505, Thread name : pool-1-thread-142
Executed @ 13:22:57:510, Thread name : pool-1-thread-143
Executed @ 13:22:58:514, Thread name : pool-1-thread-144
Executed @ 13:22:59:516, Thread name : pool-1-thread-145
Executed @ 13:23:00:516, Thread name : pool-1-thread-146
Executed @ 13:23:01:522, Thread name : pool-1-thread-147
Executed @ 13:23:02:526, Thread name : pool-1-thread-148
Executed @ 13:23:03:528, Thread name : pool-1-thread-149
Executed @ 13:23:04:530, Thread name : pool-1-thread-150
Executed @ 13:23:05:531, Thread name : pool-1-thread-151
Executed @ 13:23:06:536, Thread name : pool-1-thread-152
Executed @ 13:23:07:538, Thread name : pool-1-thread-153
Executed @ 13:23:08:544, Thread name : pool-1-thread-154
Executed @ 13:23:09:549, Thread name : pool-1-thread-155
Executed @ 13:23:10:552, Thread name : pool-1-thread-156
Executed @ 13:23:11:555, Thread name : pool-1-thread-157
Executed @ 13:23:12:558, Thread name : pool-1-thread-158
Executed @ 13:23:13:559, Thread name : pool-1-thread-159
Executed @ 13:23:14:564, Thread name : pool-1-thread-160
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