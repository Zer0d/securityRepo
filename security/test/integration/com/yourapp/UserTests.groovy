package com.yourapp

import static org.junit.Assert.*
import org.junit.*

class UserTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testAdminUserExists() {
       User user = User.findByUsername("admin")
       assert user.username == 'admin'
    }

    @Test
    void testZerodUserExists()
    {
        User user = User.findByUsername("zerod")
        assert user.username == 'zerod'
    }
}
