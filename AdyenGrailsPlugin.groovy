class AdyenGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.1 > *"
    def title = "Grails Adyen Plugin"
    def author = "Patrick Huetter"
    def authorEmail = "info@patrick-huetter.de"
    def description = '''\
This plug-in allows Grails applications to integrate with Adyen ( http://www.adyen.com ) and its Payment Notification system.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/grails-adyen"

    def license = "APACHE"
    def organization = [ name: "encircle360", url: "http://encircle360.com/" ]
    def developers = [ [ name: "Cedric Wetzel", email: "info@cedric-wetzel.eu" ]]
    def issueManagement = [ system: "Redmine", url: "http://basecamp.encircle360.com/projects/grailsadyen" ]
    def scm = [ url: "http://github.com/PatrickHuetter/grails-adyen-plugin/" ]
}
