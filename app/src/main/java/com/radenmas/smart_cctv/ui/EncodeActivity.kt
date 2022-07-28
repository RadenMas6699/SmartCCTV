/*
 * Created by RadenMas on 25/7/2022.
 * Copyright (c) 2022.
 */

package com.radenmas.smart_cctv.ui

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Base64
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.radenmas.smart_cctv.R
import com.radenmas.smart_cctv.databinding.ActivityEncodeBinding
import java.io.ByteArrayOutputStream


class EncodeActivity : AppCompatActivity() {
    private lateinit var b: ActivityEncodeBinding

    @SuppressLint("WrongThread")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityEncodeBinding.inflate(layoutInflater)
        setContentView(b.root)

        val byteArrayOutputStream = ByteArrayOutputStream()
//        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.imggg)
//        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)
//        var imageBytes: ByteArray = byteArrayOutputStream.toByteArray()
//        val imageString: String = Base64.encodeToString(imageBytes, Base64.DEFAULT)

//        Log.d("IMG ENCODE", imageString)

        val str = "data:image/jpeg;base64,%2F9j%2F4AAQSkZJRgABAQEAAAAAAAD%2F2wBDAAoHCAkIBgoJCAkLCwoMDxkQDw4ODx8WFxIZJCAmJiQgIyIoLToxKCs2KyIjMkQzNjs9QEFAJzBHTEY%2FSzo%2FQD7%2F2wBDAQsLCw8NDx0QEB0%2BKSMpPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj4%2BPj7%2FxAAfAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgv%2FxAC1EAACAQMDAgQDBQUEBAAAAX0BAgMABBEFEiExQQYTUWEHInEUMoGRoQgjQrHBFVLR8CQzYnKCCQoWFxgZGiUmJygpKjQ1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4eLj5OXm5%2Bjp6vHy8%2FT19vf4%2Bfr%2FxAAfAQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgv%2FxAC1EQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEKFiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4%2BTl5ufo6ery8%2FT19vf4%2Bfr%2FwAARCADwAUADASEAAhEBAxEB%2F9oADAMBAAIRAxEAPwDyz5aYyjrurVUtTmVQNwxwaOAfvUOmlsLnE6nrS8f3qPYh7R9A%2FwCBU7HpQqaRPPcP50Y460%2FZov2gDbSk96XsBc4xm9zTaj2I1ICR60zjscU%2FZvoXzsOPWj8aPZWHzC8etGc0nSH7RifWkxT5LC9qHFOGMVSpg5gDilPPek6YnIbinbFPTtS9nYfOK43JmoqOQfOIcUHmj2YucT%2BdOzxS5NQuJScU%2FZofML%2BNH4mj2ZPMNopezKUi3gc0mOeeRUusyeW4EfSlAGOKFWYvZoNoFBUVXtpIOUVQo9KXbU%2B0YlBXHY5pn4ChVWPkQHGKYcfeyKbrSH7NDQMt7U7AAxSjWHyEZx6036Gn7Vl8gcetL7cGk6jDkQnRcUtHO0LlQv0PXrSAUe1YvZigcdaeBR7RhyIfJGAeKZj5uaXtGHKhcL2oz2odRj5R2B9RTDHjNCqtC5CIj6U0j3p%2B0Y1FBj3puKOcB9Np84cotNpc7DlQdKBRz6D5C99BTcitPYnP7UQYzTjjtmmqXQOcXI5pM1P1bUFO4mVx%2FF1o384p%2BxH7QN%2BKYpGO9JUrD5tBCRjikGPeq9kP2hIpQDndTCQTxnFTKj0GpjPloJpeyL5xOKXtS9kLnClAp%2BzF7QeqZq0ltvHIf8Kn2RfOTpZR9ct%2BYqwunxHoJT%2BNTJE8w8WMZ4O%2Bo5tOhLfJkH61KjZBzalOW0dPeqbAqeRVqnoLnG5qQNyBin7EOYhfHamVXstA5%2BgcUZpezK5haTij2YucSl70ezDmEpO9Hsx8xcyCOMHmjdj%2B7%2BVLn7ktCb%2B%2FFOMmByVHb7tTzdB8om7PpQW%2BlVz2diOUN30%2FKm5x%2FwDqp89wSE9zj8aGbHdf%2B%2BaTkUogvXsT9KfuUH%2BD8qtT0BojkfPp%2BApm71x%2BVQ5lJDt3GOPypM8dsfSkpagJkeoH4UZ%2Bn5VTmOwA5ParCJSchWNC1g39lrWitf738q5XUKsW47fHCqo%2F4DVpbdcfdX%2Fvms%2BcQ%2Fycdl%2F75qKW3D8cflTjIVirJZKF4wfqtULmwjZeQufXbWntNRqJh3do1v3DL7CoN3G4bc%2FSulSuhWAY9qifrjA%2FKnzC5WMz9KTNK%2Bg0h27ntQTn0%2FKlzBYKQmnzCsJn6UbvpQVYuM249TTfMIXjit3SVrHMm3oAc54NLv8AzqVTW5bbQByD1Io79afLG5nzMCfembqHFFXE3Z7UsZJHen7JFKTsSF8YFMediMAnHpT9mrCTdyGnbqjkRdxAcDAo3U1TVgdwz9aWp5AuTRCtO0h%2BbPOc1nKKC7Ni3X1q9EK5nAq5ejixU4Tis0ig8vmneVVcoNjHhx0qnLGfU00IoT2%2B9SDXMahZvbvkj5PUV1UY9CLlDdSN7Vryj5iKkpcqC4oNFLlDmDNGaOVD5gpKqyQuYt%2FhTcgk5FL2yJ5Oo7PHSk%2FE%2FiaTq2BwF7cilH0o9qieUQ4xUXHpQ6g0h6qo6fqakyACP60vaoOW5CzUzPtSdUvksriEjNGaaqaFcgq4FLjC52%2FKPemqgCFhup69elS6hLpluHA61sW0Z9KylMtRNOCNsdPzq%2Fbx4IrndQOUvr0px6Uuaw%2BUctTArS5tBWFI3Cq0sYp8wWM%2BVKyL%2BFHibNXGdiXE5GVQkhXtSDHSuv2gcugw4BplPmDlAfSlqXMOQOKPpR7QOUSijm6j5SzwD979KB1zu%2FStnBGHtGHGPvEeny0D03%2FXIo9krD5h%2FwAqdX6%2B1GR%2Fe%2FSn7FdBc3kN4xwc%2B%2BKb8o%2Fiz%2BFHs%2BhSY4nvn9KjaT3xUexQcw0%2F71JwT1x%2BFHskVdhx03fpScev6VSgguxePX9KT5M9dtHIPnYvB75%2FCpVIA68VLpici3byrG25h%2BldDY6pZH77qjZrKrQvsK7OksPJmUFCD71pizGP%2FrVy8pomIbb2qI2%2FpU2HclW14pptj2osMZtZaa3NNIVytLGMVjahFlOKpImRxt3B5Tn5s%2FUVUrtUSFIZn3op8iK5hwx600GnyBzC%2FjSUuQVwpv40vZq47l7I9KUD2LUvaLqJRuTbOP4%2F%2B%2BqcNsScZPtmp9poTydBnfPQfWm7h70uYOQhdx2X9aTdjoP1qudFKBGzhj7UB8djj%2FepOpcv2YnFJ%2FKhVQ5WxM0vFPnQuVhxRnA%2BU0e0QcrHDGelXrSBp5AB3qXVSFynTWnh61Ab7UWc%2BzYpbjQLPGIt6Hs26sPblco3T4tQ06ZdnmTQg9jmu0srsSIOOaznOLeg7WNEKHp62wzUXBj2e0gjzNIgx71iXninR4ZXiik8%2FHdatEasjGqWVzHu86JT%2Fd3ZxUTOvamUhGxis%2BdN3FTzWYNXOM1dR57DH3TWPn5q7YzEoiEim5FHMOw%2F8P1ppxT5gsHag0ucVhM8dKTvQpIfKaqxDv8AzqeNIhk4PHvWvsjk9oxvDHK5pu6CP5pA8p%2Fu54qXSDmkVXl3Pk81ESP9r86r2aNFJ2sJuAphYZ6frT9nG5fMxCRTeAKXJErmYvy%2B%2BaPl96ORC52JwKOKXs0Cmwpflp%2BzQ%2BYkiwXFdZZCPT9P82QnI%2FhLdawq043BskttT864Xe6DPABfpXRRRq0SllyCOuawnStoUpA1vsPy5xSW8%2FlXK1HKirnSaefNNWb1ig2pwaiwmc5d6dFdOTMM5pkGn2lsCI40UHr8orUBraBpksm%2FyyH%2FANlql%2BweTEsa5ZVGAaHqTcpzExSbWqJjkUcgXOX1xF89yB1xXNyAeZXVCGhPNYj4pPlq%2BUpSH0hp8lxcwnFJU%2BzQuZiHFLRyDub2Se%2BPwpjuEBG%2F9KnmM%2BVEBuHPCdPp1qAgy58vnvS9pbY09mhuKY3Wn7QOQYfrzRx60e0kVyB360cHpg%2FUUvasOUafrRxT9o7g4gaXj1o9ox8ofTFJ3p%2B0YuS5ZtV%2BccfnWpJ9oujskmwrdMis3PW43AimsZk%2BbYzoemEzXpHgzwfqEvhgTyO1nMWLKkuWDL2rOdW6IbsTae63qXELr5NzbHa8ZrntXk8i9THUtisblpana6DIFjyw7VPN%2B8kOKzQMxtRlW2Tk%2FNngVjC%2FzL88kaD%2FAG2AqmPQ2rFvOj3qY5EHdDuqZZucVRJDdqZYSOlc%2B%2FXbmlzDMDX%2BCpz1FczJ17V005uxFiLtSAVrzMrkHijvS5tbFOKG0najmJ5RKKfMx2NZ2JXPRc9arMEJ3c1r7Ew9oNKqeoyPrS4X%2BIfmaf1dB7RojYjoOlM2jrk1KoIftGGF96MLS9jYv2obV75oKrnjdT9ghe1Y04980VTooftQwKcAKzdIPasAoJ708p9aHRTHzGhpkAdlBz%2FhW9JpxkdWVOB6VjOEUx81zVs7PYmJPMz9eK2I7i4H%2FLxP%2FwB%2FTWHLYe4kQtrWc3Z3ecV2s5btXO5%2FtbW98SHywelHs7q4J6ndWK7IKtW0mycHaD7GsuWw2zn9as1uJZt8rK5OMItcV4h0dYrstbRO0JXj%2BM9K6KS1M7nYeGvClzqOmrfXOnnRjDAsMPlkqZDyTJVUXVxaX%2F2TUVUT54deFcUpRuPm942VO6OsK%2FUJcfL6VmojbOY1o%2BZMPQCudnUBq7YU7ohSIMfWlq%2FZj5x4xRS9mh8wmOfWmupVsMMGjkBTG0cUezDnLzbv9mm%2BXn0p%2B1M%2FZWGyYA6CoeW54FP21ivZ9RNjf7NOw2O2Kj29x%2Bz0EHWl2nNP2wKmGD6LSbD7U41g9mG00bW9qPb6ByBtPpRtx70va9g5Ca3TruFWGjGBU%2B2ZXIbeiW%2B07nX5q6qCKuOpU1uNRLIgxTivpS5rlWOf1%2BY8wqf96tXwxbLHbcL8%2Fem5aWEonX28Q8uoXQq%2FFZ8wcpTuIPNkJ6E1HDaujDK5HtV3FY1Mj7JtM93kdAJDisCexWWQFxux0zT59CVEsQxlExWNq6kSZojIbVzjbxy8nbAzWLccy8V2QmSoIhxSbavnHykgHHSjbmo9r1DlGlTTdtP2g%2BUMUhFHtA5S95uOy1AZXbsBT5PIIvqNDN%2Fs0uTu%2FhqeTyD2gu45%2B6CKapbbyF%2FGhQDnDJx91MfjRuOOlPk1DnFLHsBRls%2FwfrR7MOYTJHYUbmz0pezuTzCZYdqXLf7NHIXcsxN6CpgSZACBUcjJudXpqbeSBW5BxXLOOppzFlAajv7hLS0aZugpKN2FziYnmvL3lAd5Jr0PSYCkS%2FJ1p1FZhc203KtBOetZ2AXyNy5FNWMr2oETgZXJWqk0IPQUWEijKCprG1RdwzjoKtIGcCYLuS3aWKJpfmP3UqG30LV7s5jsm%2BrcV1aJAVb2wvdPk23luYz69qqHParsHMPBOKM01EQgJxTDmjlHzBk%2B1JyaOWwuYVs0ESJW7ndECDdnil%2BY9ai4AQaPmpKQgw9A355p38x2E%2Bal5our7jG7TTsMB%2F8AWovruAnzU7a9DYx0ZbpU9pnzPxpMk6jS5iQi9TmuljbNcMy4lp5oraAy3Eqxxju1cretN4juW8ji1i%2B4px83vThp7xT1NTRdNW1n5PtXfaZbLKQKibu7j6GhcWZjWsqZSrVmhItw8LVoIGFMTLEUKNndVO5gUH5RTIMS8HWsG%2BJ2GnEsdoUEVroFvwc4LHPqattAzQeY%2FwAq%2Bi8VVxHL%2BJNM26NdGAfKE8zBPp3rzz5q6qQuo%2F5qCDWtyRdr9qYc0hjeaTmqGTb%2FAPY%2FWlD%2Bq5%2F4FWWg7CFj02%2FlSbgOqfrTumhi7%2F8AYP50Fj2U0k0TcN3bH60b%2Bfu8emaLoYeZ7H6Zo347frRp2FZiF%2Ben4Zpd%2FwDs%2FrTui7aCb%2Fanbhj7v%2Fj1IQRtz0OKsRZB5FFx7GzZzbCmOufWuosJd7Dvn0rkna5KOZ1y%2Bmn1WUTAgRthI8nAFb3hmXOjSvbBZLiME%2BQ2fm61bWhbTMeDxLdx3P8ApFuiJkZ25%2BWvQdP1mPcqI%2FNZTVnoFmRat46sdJuhDc%2BdvxnAjro7fUbDV7FbmyYNGw4NTytaiRaiUNaIfapV4FSBI0gxVKaYZLUEmHePjPvWBfy5kWNRln4xVFMlina0ubW3uraXynT5HHStO8kH2LA70xGdrEZbSpkI5e0f%2BVeQbuBXVSegiVT7Uua0uAVGee1K4tbiZ46UlVexViTOT97H4Um7n5W%2FSt3HUzuAI7v%2FAOOUmexP6VPIK4uQOj5%2FDFGfU4%2FDNLkAQ%2FX9KBx3B%2FCqsFwz6t%2F47Snp1%2FSjk6i5he3p74pnGOD%2BlJxGL%2BP6Uuf84p8oXFzyOf0q2hHHzZqbAmWYJMMOa6nRn3Qqc%2B%2FSuesi0asrxzY82ON8f3lpkNvaxXAlhjEUnrHxXOr7DuaVvY2d23%2BlWcExPd0rYt9H0q3mVltxu7CobZVzbuU025sil1p8NzxgB16VzOm6JLZ3TrbbYLNmJ25%2B7SuNaHVqyqu1fu9KryP6UiSBpKqzS0wMa%2BmwDmsbTdt1rR81gIoPmZicAVViJM5fxNqC23i%2B8m0m%2B3xbgVZeRnFdNoN%2FdX%2FhyF76RXkkmbBC4%2BUV0yhaN2OAeJtWSysZXZ1Ezx%2BXAnc%2B9eYVpSjpcQ8GlzWvKITNJS5QuNpKaiVclpny571lzgoiNSmn7RlWQny%2BtLxnvSc2HILkZ4%2FWk4o9ow9mGVzSn60%2FaMlREPtRxT9qylEXIoqfaWHyijFTRbc0nUYuUsKa6nT5QICem6uerIfKWPtO3vVuxlXytxbce5rLnY7G3Y3gyMAGtZPtJff9mfHtzU3CxcWTcPT2pyydqTYEwbiopGpAQZzVO5aqEYOpS%2FI1c1q1sH8OTTPO0SGQHgffPPFaQlZhY5vSrD%2B0NShtOkZOZCo6L3ruda1eHRdOj2IBNt8u2g%2FuqO9azlzSsFjzy%2Bu5766e4uZN8rd6q8VtzdCeUkBpcU%2BYLCUlHMFhKbT5irD%2FAJM9KTjP3c%2FjVyok%2B0Eyvdf1peOeP1peyFzhx6UZHpU%2BxXcPah8h7frS%2FLn2p%2By6B7QPl9P1pPl75pewD2gYFGE9P1q%2FZaD9qHy0vGKTpdx84vy%2F5NOjPPb86XsUZqoW0IzXRaccxqv90Vz1aRftBk77Ls7unbJ60gvGjbcB8tL2NwUzUtb%2FAHY8s849a3I9ZZCriYqR%2Fdeo9lYdzSg18SSKl3huwlHWtbI6%2BtZOJQokxUbyUuUVyEy4qpcP1p8o7nOarMoiZn4UcmrVlDpPiHw5FGctF3TzMOrDvV8ttSOYp3S6f4WtXkSHaJPlx%2FHLXnmo30mo3r3Vwfnft%2Fd9q6KVK%2FvCuVaTitvZhzjxjFLS9kDkHFJxRyBzidqSn7MOYXHPpSH60vaj5Qox6EUlVY1AO1FHtA5EKvvijGaftGPkDpQPr%2BlT7QOQPxpPxqvaMXJqLgUuPRhS9qw5RAOad%2Fy0HP6Uvai5S0n3hXS6ZsUZ9azq1NB8pdvhYTeWz2w3J6d6Zaafa3FzuG7HQR7qx55JDUdTbtvDWkj5rpLvaf8AnhNt5pf%2BEXsvMLWur3USZyIZ4vMo9pJDcGVb7SL62%2F492juECbix%2BWrOja1Mkgsr1ZFk7boytTfQNzqFbKVC71ncCuXqrdTYU07gcZ4nuttiVD4d%2Fl%2FDvXK21zcWkm%2B0uHiYjB2cV109Ykjb26ubtw11cPMR03npVatVLsOyDvRRzE8o5elO4xS52FgpKOdhyiU01Sk7hyok%2BX0P503j0%2FWr9gT7QOMdP1pfk%2Fun%2Fvqp9kV7UT5fQ%2FnR8ueh%2FOl7Ji9qT2P2L7bF9vWf7Ju%2FeeQRvxWpotz4et9Hvxqun3V1qMi7bVlfEcfHWn7Jph7QxmIPr%2BdM4pewF7TQPlo%2BX%2B7%2BtX7LQftBw2%2Bn60fL24qPY6h7QMilyM9KJUB85MjDPT8M1s2FxjjH61nOjoHMW5m%2BbcB%2BGauaVfJHMCSFPSsvZ6XK5jqRqCyxBVxWla3KR2rrsBL96hxK59CB8v0pUtInkSWf95JH9zP8NRJCLW7FQyvxSsIoyzYNZt3cjaSelUoXE5HB%2BIZ%2FOvU%2F2U9azAa7Y0rRJ5hGxmmnHamqbDnEpOKfsw5iRduKU4pezDmDj0pOPTH40ezDnG03NP2Y%2BYfxj3pCVFJ1XzByCZHoaX5aPavYOQOKDiiM5A4IX5cU3ij2jFyDvl%2FCk4zxRzyuPlQcZoGKOdi5UJxS5HpR7SQ1AOKX5fej2kg5USRbd1aNqPmGM8VnOpcfKkdFbwrJCuRUi6ZEz8jA9q5udhyC%2FwBjtGS1rdSxH0Bq%2Fpz3cQ2zSOxP96k6rY7I2Y5CatK%2Fy1DYxHm4rPnuOaLhYpTS8VkXLm4baucVUZ2M5I5HVmVtUnA6Kdo%2FCqYxXcpuwcgh60cU%2BcfKhKKOYOUeuKXijnY%2BUQ4pBij2jFyoa2KbT9oHKS5bFNy3%2BRVuKZAozikO72pcgXE54paqw%2BYXJozzxRyrYOYOaSjlC4c0uSepzSshCUuamwcwZ5o5puAXFVyDWxpz8getRKCKudTpZUOFb8sVvpCHrjkirjzZ46U8WPes7DuO8rb0pp3UxkUhwKzZ5FzknFOxLZnvI1zxGcL61J5IiXIq7ak3OAlGZXP%2B0f51Aa7YoXMLRTsFxM0dqfIO4oNOzU2C4mabzQkK4ZOMUmaaiUTlj6Uz8OaWgrB26YFBzU89gHfw7RGSeuaZRzodrgM9NvNLyOCpFNzCwUnOfumlzILD93y42800UcyEB%2F3TRS5rDsGaCadxWEzVq2nMZ%2B7n8amRVjqNNvs8bsnOa6WyvPlHFcctGVY0UuwTVyO4TFSAryA1VlcLSYjHv74RZyPasoGW5k%2BYYHpT6CsacEWxKr3rbIzihPUdtDz3nGcHk008133IGbaac0cw7DaKfMFhwpDRzDsGaM0EiUlK5SJOc8Uv%2BelaCG8mnZahkMTJFJn1%2FlQOwDOP%2FrUZ96d9Q2AE5%2F8ArU4tzx%2FKlYQmeKM%2F5xSEJ1FLz%2FkU9ihM8Uc9f6UAJzUsZ9KTuBagmkgkDox%2FKtyx1ry2Adjjv8tZVI8w0bdvq9vJjEoq8upxgZLHFcvKyh%2F9rw%2F3zVSXUZbpf9ERiv8Az0I4pWtuIpC2Zn%2Bdi5%2BlakEOxRRcZYP3ax9SY%2BWfaiG4XOD69jnvSZr0SBKTmp6gJTDTsNAKTmkMUGigQlJQBMN9NO6ps7jUrIBmgM3rxRZjbQZpvzkU%2BWTEpC%2FNmglz96jlDQPm20fNSsx6WD5qT5qfKGg7LY60356VmO6HfPjrSHd3NNJiugp6bqm0haE3NKN1LlKFDSDozDHvVm1fUbiTFs0zHuRUyVtxnUafo6RKJdQna4n%2FALufkWtOSQniuSV5CQ6EVYGR1pJANYmsfVT%2B5PNV1A4UE0nNd6uSB3Ug3CiwBzmmHNADeaOakYc5o5p2YaBzik%2BanZjJzu9KQ59BV85jyDec9uKX5sdBR7QqwnPbFHJ9KbqoOQXn%2B7Sc0vaCUQ59M0fN7Ue0Q%2BQOfSjnPSmqgcoc56CjmlzoXKBz3pOfSjnCwvPtT1pc4%2BVkg9qdz6CjnDl1LunQwSsfPXdj%2BHJFdJbybI%2FLiRFT0rlqvUon3uf7tSRktWPMOxfi4FPJzRcCGR8ViavI32aU8fcNVB6ktHG0ZOa7uYVhOfSg5o5hWG5pKfMOwnNNJNFx8ovNJS5g5Q%2FCjmjnGTEDsTTPrmtPZoz5w2%2FWgDjrSdJWuVzhj3owPU0vZoXOwwPU0Y96PZoXMwUDNOIHvR7MfM2NpKapofOOpMYqeToLn6B3pOtN00HMKcGnr0qPZoOZjvxqaLbuANHJYOYvwJtcY6VrwGspRHctx1bjrn5Ui0ywHo38UuUVyvM4rmtfufkSAHl%2BTz2rWnFXE5GDxSV18ugnIPxopciFcbSGhwC4n402hUx8wlFPkHzBS0lTQXJf%2B%2BTTM89Fp%2B3YKmGcelGenSl7eQezQH8PrRS9sw5BeKTqaFWYKmOH%2FAaO3RaXtmHIH%2FfNJ%2BAqnVYvZh%2BVJ%2BVT7dlezQflR%2FF2p%2B1Ycg5U3N2p%2B0528ZpOqL2YY56ClH3u1HtWNU0X7efGA%2BK1YbiPZyQaylJj5Sys%2Fcbasif1IrHnHyEizYpr3PpSuLkKV5ei3h8yTB9B61yk8rTTNI%2BNzVvSn1J5BlKK29pcOTQDim0e0DkE%2FKm0vaC5BKSn7Rj5RaSl7Rj5Qo%2BtHtGHKSdKTj0rVxRmpMTvSVKgirsWiqUEK4UCjkQXYtFL2aFcKX8KXs0F2H4UdqPZxHzMKKORC5hUOJBVr7zgipcEPmY6ePowFV%2F9qjkRXMyeNwatxHFJwQcxbSXtU6y1jy9B8w%2Fzqr3V7HbpnOZOyUlT6E8xg3M73Em%2BT8KirpUFsHMJSiq5YiuKMbuelNpNIOZiU3vS5UNNimm0cqHcKSiyC4UUcqC5MTTGNJSGoi59RSE0%2BYSiLn2o%2FCp5%2BwmgzRuPYUKQ7BnmlJp8wrBmlzxRcdhM%2B360gPGadx8oueKM%2B1TzE2E%2F4DVi2mG7a1EnoVY1ZObfb6dKoKuTUKQ7CMhX7opyORVcw7FhG5zVjzsDLcVjqFipPf54iH41n7s8mtloRYM0maakFgzzRmjmHYTNJmi5NhueaTNHMOwUGgYZpOKNQsJRRcLH%2F9kA"
        val cleanImg = str.replace("data:image/jpeg;base64,", "");
//        val image = cleanImg.replace("%2", "\n")

//        Log.d("IMG ENCODE", image)



//                val urlImage = dataHistory.image.toString()
//                val cleanImg = urlImage.replace("data:image/jpeg;base64,", "");
//                val image = cleanImg.replace("%2F", "/")
//
//                val imageBytes = Base64.decode(urlImage, Base64.DEFAULT)
//                val decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
//                holder.image.setImageBitmap(decodedImage)



//        imageBytes = Base64.decode(cleanImg, Base64.DEFAULT)
//        val decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
//        b.imgDecode.setImageBitmap(decodedImage)
    }
}