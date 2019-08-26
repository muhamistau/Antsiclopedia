package com.islam.antsiclopedia


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.islam.antsiclopedia.entity.Ant
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    private lateinit var ants: ArrayList<Ant>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        ants = ArrayList()
        populateList()

        val antListAdapter = AntListAdapter(activity as Context, ants) {
            val directions = ListFragmentDirections
                .actionListFragmentToDetailFragment(it)
            findNavController().navigate(directions)
        }

        antRecyclerView.adapter = antListAdapter
        antRecyclerView.layoutManager = LinearLayoutManager(activity)
    }

    private fun populateList() {
        ants.add(Ant(
            name = "Asian Marauder Ants",
            latin = "Pheidologeton diversus",
            description = "P. diversus is a eusocial insect and individuals have continuous allometric variation in size and morphology to facilitate task allocation and partitioning of work. Minor workers are between 1.3 and 2.5 mm in length, but major workers are much larger. Between the smallest minor and largest major workers there are many intermediate forms. The largest workers can have heads approximately 10 times as large as those of their smallest counterparts. The dry weight of a large major worker can be approximately 500 times as heavy of that of its smallest counterpart. These size-related morphological differences correspond with their division of labor. For example, small, young, minor workers specialize in caring for the larvae but extend their activities as they grow older.\n" +
                "Minor workers have yellowish brown to reddish brown bodies. Their mandibles each have five \"teeth\" and their antennal scapes are short and do not exceed the posterior margin of the head. Minor workers have rectangular heads with weakly convex posterior margins in full face view\n" +
                "Major workers have reddish brown to blackish brown bodies. Their heads are proportionately larger and almost square with convex posterior margin in frontal view. Mandibles of major workers are large and triangular, with an acute apical \"tooth\". Their masticatory margins lack distinct \"teeth\". Their eyes are relatively small and their antennal scapes are half as long as their heads.\n",
            imageUrl = "https://i.pinimg.com/originals/d0/49/8e/d0498e442a2283994f9a0f2f22ec4dc9.jpg"
        ))
        ants.add(Ant(
            name = "Fire Ants",
            latin = "Solenopsis geminata",
            description = "Fire ant is the common name for several species of ants in the genus Solenopsis. They are, however, only a minority in the genus, which includes over 200 species of Solenopsis worldwide. Solenopsis are stinging ants and most of their common names reflect this, for example, ginger ants and tropical fire ants. Many species also are called red antsbecause of their light brown color, though species of ants in many other genera are similarly named for similar reasons. Examples include Myrmica rubra and Pogonomyrmex barbatus. \n None of these names apply in all countries nor to all species of Solenopsis, nor only to Solenopsisspecies; for example the colloquial names for several species of weaver ants in the genus Oecophylla in Southeast Asia include \"fire ants\" because of their red color and painful sting; the two genera, however, are not closely related. Also, Wasmannia auropunctata is commonly called the \"little fire ant\".",
            imageUrl = "https://media.mnn.com/assets/images/2019/01/shutterstock_668378221.jpg.653x0_q80_crop-smart.jpg"
        ))
        ants.add(Ant(
            name = "Asian Weaver Ants",
            latin = "Formica virescens",
            description = "Weaver ants or green ants (genus Oecophylla) are eusocial insects of the family Formicidae (order Hymenoptera). Weaver ants live in trees (they are obligately arboreal) and are known for their unique nest building behaviour where workers construct nests by weaving together leaves using larval silk. Colonies can be extremely large consisting of more than a hundred nests spanning numerous trees and containing more than half a million workers. Like many other ant species, weaver ants prey on small insects and supplement their diet with carbohydrate-rich honeydew excreted by small insects (Hemiptera). Weaver ant workers exhibit a clear bimodal size distribution, with almost no overlap between the size of the minor and major workers. The major workers are approximately 8–10 mm (0.31–0.39 in) in length and the minors approximately half the length of the majors. Major workers forage, defend, maintain, and expand the colony whereas minor workers tend to stay within the nests where they care for the brood and 'milk' scale insects in or close to the nests.\n" +
                    "\n" +
                    "Weaver ants vary in color from reddish to yellowish brown dependent on the species. Oecophylla smaragdina found in Australia often have bright green gasters. Weaver ants are highly territorial and workers aggressively defend their territories against intruders. Because they prey on insects harmful to their host trees, weaver ants are sometime used by indigenous farmers, particularly in southeast Asia, as natural biocontrol agents against agricultural pests. Although weaver ants lack a functional sting they can inflict painful bites and often spray formic acid directly at the bite wound resulting in intense discomfort.\n",
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Red_Weaver_Ant%2C_Oecophylla_longinoda.jpg/220px-Red_Weaver_Ant%2C_Oecophylla_longinoda.jpg"
        ))
        ants.add(Ant(
            name = "Carpenters Ants",
            latin = "Formica ligniperda",
            description = "Carpenter ants (Camponotus spp.) are large (0.3 to 1.0 in or 0.76 to 2.54 cm) ants indigenous to many forested parts of the world.[2]\n" +
                    "\n" +
                    "They build nests inside wood consisting of galleries chewed out with their mandibles, preferably in dead, damp wood. They do not consume the wood, however, unlike termites. Sometimes, carpenter ants hollow out sections of trees. They also commonly infest wooden buildings and structures, and are a widespread nuisance and major cause of structural damage. However, their ability to excavate wood helps in forest decomposition. One of the most familiar species associated with human habitation in the United States is the black carpenter ant (Camponotus pennsylvanicus). The genus includes over 1,000 species. They also farm aphids. In the farming, the ants protect the aphids while they excrete a sugary fluid called honeydew, which the ants get by stroking the aphids with their antennae.\n",
            imageUrl = "https://www.thespruce.com/thmb/xRKRvKZefe_ecINJYmJ87oPQYtg=/450x0/filters:no_upscale():max_bytes(150000):strip_icc()/Carpenter-ant-by-Richard-Bartz-577d271a5f9b585875d0a34d.jpg"
        ))
        ants.add(Ant(
            name = "Pharaoh Ants",
            latin = "Monomorium pharaonis",
            description = "The pharaoh ant (Monomorium pharaonis) is a small (2 mm) yellow or light brown, almost transparent ant notorious for being a major indoor nuisance pest, especially in hospitals. The pharaoh ant, whose origins are unknown, has now been introduced to virtually every area of the world, including Europe, the Americas, Australasia and Southeast Asia. It is a major pest in the United States, Australia, and Europe.\n" +
                    "\n" +
                    "This species is polygynous, meaning each colony contains many queens, leading to unique caste interactions and colony dynamics. This also allows the colony to fragment into bud colonies quickly.\n" +
                    "\n" +
                    "Pharaoh ants are a tropical species, but they thrive in buildings almost anywhere, even in temperate regions provided central heating is present.\n",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNxiMxjpe-JtSMgs3fp5vOh2PWEpQ_0k_2UYhf-CWVln0_NKPD"
        ))
        ants.add(Ant(
            name = "Trap-jaw Ants",
            latin = "Formica haematoda",
            description = "Commonly known as trap-jaw ants, species in Odontomachus have a pair of large, straight mandibles capable of opening 180 degrees. These jaws are locked in place by an internal mechanism, and can snap shut on prey or objects when sensory hairs on the inside of the mandibles are touched. The mandibles are powerful and fast, giving the ant its common name. The mandibles either kill or maim the prey, allowing the ant to bring it back to the nest. Odontomachus can simply lock and snap its jaws again if one bite is not enough, or to cut off bits of larger food. The mandibles also permit slow and fine movements for other tasks such as nest building and care of larvae.[citation needed] The ants were also observed to use their jaws as a catapult to eject intruders or fling themselves backwards to escape a threat.\n" +
                    "\n" +
                    "The larvae of trap-jaw ants are remarkable[4] in being ornamented with long spikes and presenting dorsal adhesive pads for fixation onto internal ant nest walls.[5] They are carnivorous, extremely active larvae. Apparently, they undergo three larval moults before entering metamorphosis. Their pupae spin no cocoons.\n",
            imageUrl = "https://www.nomorebugs.com/wp-content/uploads/2018/05/trapJawAnt.jpg"
        ))
        ants.add(Ant(
            name = "Dracula Ants",
            latin = "Amblyopone",
            description = "Amblyoponinae is a subfamily of ants in the poneromorph subfamilies group containing 13 extant genera and one extinct genus. The ants in this subfamily are mostly specialized subterranean predators. Adult workers pierce the integument of their larvae to imbibe haemolymph, earning them the common name Dracula ant.\n" +
                    "Amblyoponinae is characterized by these worker characters: eyes small or absent, situated behind midlength of side of head; anterior margin of clypeus with specialized dentiform setae; promesonotal suture flexible; petiole very broadly attached to abdominal segment 3 and without a distinct posterior face; postpetiole absent; sting present and well developed.",
            imageUrl = "https://public-media.si-cdn.com/filer/5a/ba/5aba62ba-d384-425e-b577-2ef9a6237ab3/draculaantsp.jpg"
        ))
        ants.add(Ant(
            name = "Yellow Crazy Ants",
            latin = "Anoplolepis gracilipes",
            description = "The yellow crazy ant (Anoplolepis gracilipes) is a species of ant, introduced accidentally to northern Australia and Christmas Island in the Indian Ocean, that has caused ecological damage in both locations and is now found in the northern suburbs of Brisbane.\n" +
                    "\n" +
                    "It is colloquially called \"crazy\" because of its erratic movements when disturbed. Its long legs and antennae make it one of the largest invasive ant species in the world.\n" +
                    "\n" +
                    "Like several other invasive ants, such as the red imported fire ant (Solenopsis invicta), the big-headed ant (Pheidole megacephala), the little fire ant (Wasmannia auropunctata), and the Argentine ant (Linepithema humile), this is a \"tramp ant\", a species that easily becomes established and dominant in new habitat due to traits such as aggression toward other ant species, little aggression toward members of its own species, efficient recruitment, and large colony size. Also known as the long-legged ant or Maldive ant, it is on a list of \"one hundred of the world's worst invasive species\" formulated by the International Union for Conservation of Nature (IUCN). It has invaded ecosystems from Hawaii to Seychelles, and formed supercolonies on Christmas Island in the Indian Ocean.\n",
            imageUrl = "https://www.csiro.au/~/media/BF/Images/Intext/Yellow-Crazy-ant-queen.JPG?mw=957&hash=6A159C7D6F7B20DF4C0D88B8157827DF191A4435"
        ))
        ants.add(Ant(
            name = "Asian Bullet Ants",
            latin = "Diacamma rugosum",
            description = "Diacamma rugosum, also known as Bornean queenless ant, is a species of ant of the subfamily Ponerinae. It is found from many countries throughout the world. 20 subspecies are recognized.",
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/CharlesLam_-_Diacamma_rugosum.jpg/800px-CharlesLam_-_Diacamma_rugosum.jpg"
        ))
        ants.add(Ant(
            name = "Black Crazy Ants",
            latin = "Paratrechina longicornis",
            description = "The longhorn crazy ant (Paratrechina longicornis), also known as \"black crazy ant\", is a species of small dark-coloured insect in the family Formicidae. These ants are commonly called \"crazy ants\" because instead of following straight lines, they dash around erratically. They have a broad distribution, including much of the tropics and subtropics and are also found in buildings in more temperate regions, making them one of the most widespread ant species in the world. This species, as well as all others in the ant subfamily Formicinae, cannot sting.",
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Paratrechina_longicornis_casent0134863_profile_1.jpg/755px-Paratrechina_longicornis_casent0134863_profile_1.jpg"
        ))
    }
}
