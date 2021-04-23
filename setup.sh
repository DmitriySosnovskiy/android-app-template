read -p "Enter new domain: " domain
read -p "Enter new company name: " companyName
read -p "Enter new project name: " projectName

#что меняем
FIND=ru.dsosnovskiy.template

#чем заменяем
REPLACE="$domain.$companyName.$projectName"

testResult(){
if [ $1 -eq 1 ]
then
    echo -e $2; #ошибка
else
    echo -e $3;
fi
}

echo -e "\nEditing ..."

for FILE in `find $PWD -type f | sort`
do    
  if [[ "${FILE: -3}" == ".kt" ]] || [[ "${FILE: -3}" == ".gradle" ]] || [[ "${FILE: -3}" == ".xml" ]]
  then
  
    PERMISSION=`ls -lh "$FILE" | awk '{print $1}'`  #получение прав доступа к файлу
        
    if [ "${PERMISSION:0:3}" == "-rw" ]  
    then   # Чтение - запись
    
     sed -i s/$FIND/$REPLACE/g $FILE
     testResult $? "Error while editing file $FILE." "File $FILE was successfully edited."
     
    else
        echo -e "Not enough permissions to edit the file $FILE."
    fi
  
    
   fi
done


#переименовывание папок пакетов ru.dsosnovskiy.template
cd app/src

directories=(*)
for directory in ${directories[@]}; do
    cd $directory/java/ru/dsosnovskiy
    mv template $projectName
    cd ..
    mv dsosnovskiy $companyName
    cd ..
    mv ru $domain
    cd ..
    cd ..
done
