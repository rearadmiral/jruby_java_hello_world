package com.dephillipsdesign.jruby;


import org.jruby.Ruby;
import org.jruby.RubyHash;
import org.jruby.javasupport.JavaEmbedUtils;
import org.jruby.runtime.builtin.IRubyObject;

import java.util.HashMap;

class Main {

    public static void main(String... args) {

        Ruby runtime = Ruby.getGlobalRuntime();
        RubyHash hash = (RubyHash) runtime.evalScriptlet("{ :osito => :bonito, :luca => :sleepy, :pierre => :happy }");

        System.out.println("Ruby returned a " + hash.getClass());
        System.out.println("{");
        for(Object key : hash.keys()) {
           System.out.println("\t" + key + " => " + hash.get(key));
        }
        System.out.println("}");

    }
}