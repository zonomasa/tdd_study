package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class StackTest {
    @Test
    public void SizeIsZeroAfterJustIntialized(){
        Stack st= new Stack();
        
        int result = st.size();
        
        assertThat(result, is(0));
                
    }
    
    @Test
    public void SizeIsNonZeroAfterPushSomeItems(){
        Stack st= new Stack();
        
        int result = st.size();
        
        assertThat(result, is(0));
        
        String str1 = "test1";
        st.push(str1);
        
        result = st.size();
        assertThat(result, is(1));
                
        String str2 = "test2";
        st.push(str2);

        result = st.size();
        assertThat(result, is(2));
    }

    @Test
    public void CheckLIFOBehavier(){
        Stack st= new Stack();
        
        String str1 = "test1";
        st.push(str1);
        
        String str2 = "test2";
        st.push(str2);

        String str = (String)st.pop();
        assertEquals(str,str2);
        str = (String)st.pop();
        assertEquals(str,str1);
        
    }

    @Test
    public void IsEmptyreturnFalseAfterPush(){
        Stack st= new Stack();
        
        String str1 = "test1";
        st.push(str1);
        
        Boolean isEmpty = st.isEmpty();
        assertThat(isEmpty,is(false));
    }
    
    @Test
    public void IsEmptyreturnTrueAfterPushAndPop(){
        Stack st= new Stack();
        
        String str1 = "test1";
        st.push(str1);
        
        String str2 = "test2";
        st.push(str2);

        String str = (String)st.pop();
        str = (String)st.pop();
        Boolean isEmpty = st.isEmpty();
        assertThat(isEmpty,is(true));
        
    }
    
    
    
}
