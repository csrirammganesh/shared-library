def call(String imagename){
    echo "building image"
    sh "docker build -t ${imagename} ."
}
