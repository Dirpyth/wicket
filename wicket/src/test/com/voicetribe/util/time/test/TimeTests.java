///////////////////////////////////////////////////////////////////////////////////
//
// Created May 18, 2004
//
// Copyright 2004, Jonathan W. Locke
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package com.voicetribe.util.time.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 *
 * @author Jonathan Locke
 */
public final class TimeTests
{
    public static Test suite()
    {
        final TestSuite suite = new TestSuite("Test for com.voicetribe.util.time");
        //$JUnit-BEGIN$
        suite.addTest(new TestSuite(TimeTest.class));
        suite.addTest(new TestSuite(DurationTest.class));
        suite.addTest(new TestSuite(TimeOfDayTest.class));
        suite.addTest(new TestSuite(TimeMapTest.class));
        //$JUnit-END$
        return suite;
    }
}


///////////////////////////////// End of File /////////////////////////////////