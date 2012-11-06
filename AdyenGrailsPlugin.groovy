class AdyenGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grails Adyen Plugin" // Headline display name of the plugin
    def author = "Patrick Huetter"
    def authorEmail = "info@patrick-huetter.de"
    def description = '''\
This plug-in allows Grails applications to integrate with Adyen ( http://www.adyen.com ) and its Payment Notification system.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/grails-adyen-plugin"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "encircle360", url: "http://encircle360.com/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Cedric Wetzel", email: "info@cedric-wetzel.eu" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "Redmine", url: "http://basecamp.encircle360.com/projects/grailsadyen" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "http://github.com/PatrickHuetter/grails-adyen-plugin/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
