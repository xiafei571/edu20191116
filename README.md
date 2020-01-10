# edu20191116

-- git init
-- git add ./src/ ./web/ ./pom.xml
-- git commit -m "first commit"
-- git remote add origin https://github.com/xiafei571/edu20191116.git
-- git push -u origin master
-- git push origin master

-- 不过此时会有一个坑，如果我们在创建github仓库是勾选了Initialize this repository with a README（就是创建仓库的时候自动给你创建一个README文件），此时我们就需要执行接下来的一步
git pull --rebase origin master

-- 执行完这一步再来一遍 git push origin master就可以了 
