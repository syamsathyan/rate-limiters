/*
 * Copyright 2015 sathyasy.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cxe.commons.qos.rate;

import com.github.bucket4j.Bucket;
import com.github.bucket4j.Buckets;
import org.junit.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * @author sathyasy
 */
public class RateLimiterTest {
    Bucket multiBandwidthBucket;

    public RateLimiterTest() {
        multiBandwidthBucket = Buckets.withNanoTimePrecision()
                // allows 1000 tokens per 1 minute
                .withLimitedBandwidth(60, TimeUnit.MINUTES, 1)
                        // but not often then 50 tokens per 1 second
                .withLimitedBandwidth(1, TimeUnit.SECONDS, 1)
                .build();


    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of multipleBandwidth method, for RateLimiter
     */
    @Test
    public void multipleBandwidth() throws InterruptedException {

        int concurrency = 1000;
        ExecutorService ex = Executors.newFixedThreadPool(concurrency);
        for (int i = 0; i < concurrency; i++) {
            // Consume a token from the token bucket.  If a token is not available this method will block until
            // the refill adds one to the bucket.
            multiBandwidthBucket.consume(1);
            ex.submit(new HsdActivateMockRunner());// exec thread when it chooses
        }
        assertTrue(true);
    }


}
