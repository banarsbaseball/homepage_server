apt update
apt install -y git
apt install -y vim
apt install -y curl
git config --global --add safe.directory /app
cp .devcontainer/bashrcSetting ~/.bashrc
cd ~
curl -o .git-completion.sh \
    https://raw.githubusercontent.com/git/git/master/contrib/completion/git-completion.bash
curl -o .git-prompt.sh \
    https://raw.githubusercontent.com/git/git/master/contrib/completion/git-prompt.sh
