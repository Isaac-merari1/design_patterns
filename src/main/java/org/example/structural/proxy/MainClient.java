package org.example.structural.proxy;

/**
 * The Proxy design pattern is a structural pattern that provides an object representing another object to control access to it. It serves as a surrogate or placeholder to
 * control access to the original object, which might be located on a remote server, expensive to create, or in need of additional control.
 *
 * Intent:
 *
 * Provide a surrogate or placeholder for another object to control access to it.
 * Add a level of control over access to the original object.
 * Delay the creation and initialization of an object until it is actually needed.
 * Provide a simplified or proxy interface to complex or resource-intensive objects.
 * Components:
 *
 * Subject: This is the common interface or abstract class that both the RealSubject and Proxy implement. It defines the operations that can be performed on the RealSubject.
 *
 * RealSubject: This is the actual object that the Proxy represents. It implements the Subject interface and contains the real business logic.
 *
 * Proxy: This is an object that acts as a substitute for the RealSubject. It also implements the Subject interface but controls access to the RealSubject.
 * The Proxy may create, initialize, or reference the RealSubject when needed.
 *
 *           Subject
 *           /    \
 *          /      \
 *   Proxy           RealSubject
 */
public class MainClient {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("mera.com");
            internet.connectTo("natt.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
