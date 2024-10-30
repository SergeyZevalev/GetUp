package com.example.core.core

interface Navigation{

    interface Update : CoreObserver.Update<Screen>
    interface Observe : CoreObserver.Observe<Screen>
    interface Mutable: Update, Observe
    class Base() : CoreObserver.Abstract<Screen>(), Mutable
}