cd spring_prj
# 再ビルドしたときにうまくいかない気がしていたからcleanコマンドを叩いていたが、一旦様子見でコメントアウト
# sh gradlew clean
sh gradlew build -x test --stacktrace