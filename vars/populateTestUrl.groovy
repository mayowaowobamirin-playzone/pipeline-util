#!/usr/bin/env groovy
def call(args) {
      echo "Global liberary is called -${args}"
      Properties props = new Properties()
File propsFile = new File('pipeline/config.properties')
props.load(propsFile.newDataInputStream())
println props.getProperty('TEST_SERVER_BASE_URL')


props.setProperty('TEST_SERVER_BASE_URL', args.toString())
props.setProperty('TEST_SERVER_BASE_URLK', 'abc')

props.store(propsFile.newWriter(), null)

props.load(propsFile.newDataInputStream())
println props.getProperty('TEST_SERVER_BASE_URL')
}