package com.dephillipsdesign.jruby;

import org.jruby.Ruby;
import org.jruby.runtime.builtin.IRubyObject;
import com.google.common.io.Files;


import java.io.*;
import java.nio.charset.Charset;
import java.net.URL;

public class FileExample {

    public static void main(String... args) throws Exception {
       Ruby runtime = Ruby.getGlobalRuntime();
       String rubyCode = Files.toString(new java.io.File("src/main/ruby/file.rb"), Charset.defaultCharset());
       IRubyObject rubyObject = runtime.executeScript(rubyCode, "file.rb");
       System.out.println("Output => " + rubyObject);
    }
}
