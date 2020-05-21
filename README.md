# Design Pattern Demo

## SOLID Principle


# Behavioral Pattern

### 1. Memento

#### Intent
Capture and externalize an object's internal state without violating encapsulation so that the object can be restored to this state later.

#### Motivation

In some cases it's necessary to record the internal state of an object. This is required when implementing checkpoints and undo mechanisms that let users back out of tentative operations or recover from errors.

### 2. State

#### Intent

Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

#### Motivation

Consider a class TCPConnection that represents a network connection. A TCPConnection object can be in one of several different states : Established, Listening, Closed. When a TCPConnection object receives requests from other objects, it responds differently depending on its current state. For example, the effect of an Open request depends on whether the connection is in its Closed state or its Established state. The State pattern describes how TCPConnection can exhibit different behavior in each state.

State Pattern is based on open closed principle.

#### Open Closed Principle
Classes should be open for extension but closed for modification. Not allowed to change code in our classes and we can only extend it.