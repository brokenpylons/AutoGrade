output=$(./task <<<"INPUT")

cat - <<<"$output"

if [[ "$output" != "ANSWERINPUT" ]]
then
    exit 1
fi
